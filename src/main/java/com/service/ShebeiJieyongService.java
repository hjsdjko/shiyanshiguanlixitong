package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiJieyongEntity;
import java.util.Map;

/**
 * 设备借用 服务类
 */
public interface ShebeiJieyongService extends IService<ShebeiJieyongEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}