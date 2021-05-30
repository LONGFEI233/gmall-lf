package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsCommentDao;
import com.atguigu.gmall.pms.entity.PmsCommentEntity;
import com.atguigu.gmall.pms.service.PmsCommentService;


@Service("pmsCommentService")
public class PmsCommentServiceImpl extends ServiceImpl<PmsCommentDao, PmsCommentEntity> implements PmsCommentService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsCommentEntity> page = this.page(
                new Query<PmsCommentEntity>().getPage(params),
                new QueryWrapper<PmsCommentEntity>()
        );

        return new PageVo(page);
    }

}