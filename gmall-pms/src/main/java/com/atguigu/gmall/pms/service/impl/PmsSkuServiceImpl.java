package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.core.bean.PageVo;
import com.atguigu.gmall.core.bean.Query;
import com.atguigu.gmall.core.bean.QueryCondition;
import com.atguigu.gmall.pms.dao.PmsSkuDao;
import com.atguigu.gmall.pms.entity.PmsSkuEntity;
import com.atguigu.gmall.pms.service.PmsSkuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


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