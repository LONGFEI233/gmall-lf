package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsSpuDao;
import com.atguigu.gmall.pms.entity.PmsSpuEntity;
import com.atguigu.gmall.pms.service.PmsSpuService;


@Service("pmsSpuService")
public class PmsSpuServiceImpl extends ServiceImpl<PmsSpuDao, PmsSpuEntity> implements PmsSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsSpuEntity> page = this.page(
                new Query<PmsSpuEntity>().getPage(params),
                new QueryWrapper<PmsSpuEntity>()
        );

        return new PageVo(page);
    }

}