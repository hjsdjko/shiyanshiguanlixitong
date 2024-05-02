package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShiyanshiYuyueEntity;

import com.service.ShiyanshiYuyueService;
import com.entity.view.ShiyanshiYuyueView;
import com.service.ShiyanshiService;
import com.entity.ShiyanshiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 实验室预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shiyanshiYuyue")
public class ShiyanshiYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(ShiyanshiYuyueController.class);

    @Autowired
    private ShiyanshiYuyueService shiyanshiYuyueService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private ShiyanshiService shiyanshiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shiyanshiYuyueService.queryPage(params);

        //字典表数据转换
        List<ShiyanshiYuyueView> list =(List<ShiyanshiYuyueView>)page.getList();
        for(ShiyanshiYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyanshiYuyueEntity shiyanshiYuyue = shiyanshiYuyueService.selectById(id);
        if(shiyanshiYuyue !=null){
            //entity转view
            ShiyanshiYuyueView view = new ShiyanshiYuyueView();
            BeanUtils.copyProperties( shiyanshiYuyue , view );//把实体数据重构到view中

            //级联表
            ShiyanshiEntity shiyanshi = shiyanshiService.selectById(shiyanshiYuyue.getShiyanshiId());
            if(shiyanshi != null){
                BeanUtils.copyProperties( shiyanshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setShiyanshiId(shiyanshi.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shiyanshiYuyue.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shiyanshiYuyue:{}",this.getClass().getName(),shiyanshiYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if("用户".equals(role)){
            shiyanshiYuyue.setInsertTime(new Date());
            shiyanshiYuyue.setCreateTime(new Date());
            shiyanshiYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            shiyanshiYuyue.setShiyanshiYuyueTypes(1);
            shiyanshiYuyueService.insert(shiyanshiYuyue);
            return R.ok();

        }else {
            return R.error(511,"您没有权限新增预约");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyue, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shiyanshiYuyue:{}",this.getClass().getName(),shiyanshiYuyue.toString());
//        //根据字段查询是否有相同数据
//        Wrapper<ShiyanshiYuyueEntity> queryWrapper = new EntityWrapper<ShiyanshiYuyueEntity>()
//            .notIn("id",shiyanshiYuyue.getId())
//            .andNew()
//            .eq("yonghu_id", shiyanshiYuyue.getYonghuId())
//            .eq("shiyanshi_id", shiyanshiYuyue.getShiyanshiId())
//            .eq("shiyanshi_yuyue_number", shiyanshiYuyue.getShiyanshiYuyueNumber())
//            .eq("shiyanshi_yuyue_types", shiyanshiYuyue.getShiyanshiYuyueTypes())
//            ;
//        logger.info("sql语句:"+queryWrapper.getSqlSegment());
//        ShiyanshiYuyueEntity shiyanshiYuyueEntity = shiyanshiYuyueService.selectOne(queryWrapper);
//        if(shiyanshiYuyueEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shiyanshiYuyue.set
            //  }
            shiyanshiYuyueService.updateById(shiyanshiYuyue);//根据id更新
            return R.ok();
//        }else {
//            return R.error(511,"表中有相同数据");
//        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shiyanshiYuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

