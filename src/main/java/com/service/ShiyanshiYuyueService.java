package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshiYuyueEntity;
import java.util.Map;

/**
 * 实验室预约 服务类
 */
public interface ShiyanshiYuyueService extends IService<ShiyanshiYuyueEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}