package com.atguigu.gmall.pms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.pms.entity.PmsSpuDescEntity;
import com.atguigu.gmall.pms.service.PmsSpuDescService;




/**
 * spu信息介绍
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "spu信息介绍 管理")
@RestController
@RequestMapping("pms/pmsspudesc")
public class PmsSpuDescController {
    @Autowired
    private PmsSpuDescService pmsSpuDescService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmsspudesc:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsSpuDescService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{spuId}")
    @PreAuthorize("hasAuthority('pms:pmsspudesc:info')")
    public Resp<PmsSpuDescEntity> info(@PathVariable("spuId") Long spuId){
		PmsSpuDescEntity pmsSpuDesc = pmsSpuDescService.getById(spuId);

        return Resp.ok(pmsSpuDesc);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmsspudesc:save')")
    public Resp<Object> save(@RequestBody PmsSpuDescEntity pmsSpuDesc){
		pmsSpuDescService.save(pmsSpuDesc);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmsspudesc:update')")
    public Resp<Object> update(@RequestBody PmsSpuDescEntity pmsSpuDesc){
		pmsSpuDescService.updateById(pmsSpuDesc);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmsspudesc:delete')")
    public Resp<Object> delete(@RequestBody Long[] spuIds){
		pmsSpuDescService.removeByIds(Arrays.asList(spuIds));

        return Resp.ok(null);
    }

}
