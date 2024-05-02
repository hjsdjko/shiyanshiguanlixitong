package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.ShiyanshiYuyueDao;
import com.entity.ShiyanshiYuyueEntity;
import com.service.ShiyanshiYuyueService;
import com.entity.view.ShiyanshiYuyueView;

/**
 * 实验室预约 服务实现类
 */
@Service("shiyanshiYuyueService")
@Transactional
public class ShiyanshiYuyueServiceImpl extends ServiceImpl<ShiyanshiYuyueDao, ShiyanshiYuyueEntity> implements ShiyanshiYuyueService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShiyanshiYuyueView> page =new Query<ShiyanshiYuyueView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
