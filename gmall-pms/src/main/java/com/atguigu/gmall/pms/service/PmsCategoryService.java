package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.PmsCategoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

