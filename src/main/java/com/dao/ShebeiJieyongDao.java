package com.dao;

import com.entity.ShebeiJieyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiJieyongView;

/**
 * 设备借用 Dao 接口
 *
 * @author 
 */
public interface ShebeiJieyongDao extends BaseMapper<ShebeiJieyongEntity> {

   List<ShebeiJieyongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
