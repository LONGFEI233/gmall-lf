package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 23:28:42
 */
public interface CategoryBrandService extends IService<CategoryBrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

