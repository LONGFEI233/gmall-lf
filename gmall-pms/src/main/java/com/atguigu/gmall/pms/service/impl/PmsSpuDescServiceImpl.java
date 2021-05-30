package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.PmsSpuDescDao;
import com.atguigu.gmall.pms.entity.PmsSpuDescEntity;
import com.atguigu.gmall.pms.service.PmsSpuDescService;


@Service("pmsSpuDescService")
public class PmsSpuDescServiceImpl extends ServiceImpl<PmsSpuDescDao, PmsSpuDescEntity> implements PmsSpuDescService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<PmsSpuDescEntity> page = this.page(
                new Query<PmsSpuDescEntity>().getPage(params),
                new QueryWrapper<PmsSpuDescEntity>()
        );

        return new PageVo(page);
    }

}