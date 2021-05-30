package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.PmsCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Mapper
public interface PmsCommentDao extends BaseMapper<PmsCommentEntity> {
	
}
