package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsSkuAttrValueDao;
import com.atguigu.gmall.pms.entity.PmsSkuAttrValueEntity;
import com.atguigu.gmall.pms.service.PmsSkuAttrValueService;


@Service("pmsSkuAttrValueService")
public class PmsSkuAttrValueServiceImpl extends ServiceImpl<PmsSkuAttrValueDao, PmsSkuAttrValueEntity> implements PmsSkuAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsSkuAttrValueEntity> page = this.page(
                new Query<PmsSkuAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSkuAttrValueEntity>()
        );

        return new PageVo(page);
    }

}