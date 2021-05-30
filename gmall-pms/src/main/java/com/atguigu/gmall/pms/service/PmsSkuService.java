package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.PmsSkuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
public interface PmsSkuService extends IService<PmsSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

