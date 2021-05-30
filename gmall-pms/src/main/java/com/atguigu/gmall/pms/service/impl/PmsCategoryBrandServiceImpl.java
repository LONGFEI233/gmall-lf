package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsCategoryBrandDao;
import com.atguigu.gmall.pms.entity.PmsCategoryBrandEntity;
import com.atguigu.gmall.pms.service.PmsCategoryBrandService;


@Service("pmsCategoryBrandService")
public class PmsCategoryBrandServiceImpl extends ServiceImpl<PmsCategoryBrandDao, PmsCategoryBrandEntity> implements PmsCategoryBrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsCategoryBrandEntity> page = this.page(
                new Query<PmsCategoryBrandEntity>().getPage(params),
                new QueryWrapper<PmsCategoryBrandEntity>()
        );

        return new PageVo(page);
    }

}