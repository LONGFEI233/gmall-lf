package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.PmsSpuAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
public interface PmsSpuAttrValueService extends IService<PmsSpuAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

