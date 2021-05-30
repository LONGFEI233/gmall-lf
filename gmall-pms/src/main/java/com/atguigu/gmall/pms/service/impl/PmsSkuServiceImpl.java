package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsSkuDao;
import com.atguigu.gmall.pms.entity.PmsSkuEntity;
import com.atguigu.gmall.pms.service.PmsSkuService;


@Service("pmsSkuService")
public class PmsSkuServiceImpl extends ServiceImpl<PmsSkuDao, PmsSkuEntity> implements PmsSkuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsSkuEntity> page = this.page(
                new Query<PmsSkuEntity>().getPage(params),
                new QueryWrapper<PmsSkuEntity>()
        );

        return new PageVo(page);
    }

}