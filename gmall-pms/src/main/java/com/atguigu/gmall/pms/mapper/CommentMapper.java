package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 23:28:42
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
