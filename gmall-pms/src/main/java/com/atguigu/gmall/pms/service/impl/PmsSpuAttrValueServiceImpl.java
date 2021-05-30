package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsSpuAttrValueDao;
import com.atguigu.gmall.pms.entity.PmsSpuAttrValueEntity;
import com.atguigu.gmall.pms.service.PmsSpuAttrValueService;


@Service("pmsSpuAttrValueService")
public class PmsSpuAttrValueServiceImpl extends ServiceImpl<PmsSpuAttrValueDao, PmsSpuAttrValueEntity> implements PmsSpuAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsSpuAttrValueEntity> page = this.page(
                new Query<PmsSpuAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSpuAttrValueEntity>()
        );

        return new PageVo(page);
    }

}