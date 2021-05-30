package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 22:48:32
 */
@Mapper
public interface CategoryBrandDao extends BaseMapper<CategoryBrandEntity> {
	
}
