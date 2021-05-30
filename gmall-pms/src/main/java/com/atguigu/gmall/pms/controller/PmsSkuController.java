package com.atguigu.gmall.pms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.gmall.core.bean.PageVo;
import com.atguigu.gmall.core.bean.QueryCondition;
import com.atguigu.gmall.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.pms.entity.PmsSkuEntity;
import com.atguigu.gmall.pms.service.PmsSkuService;




/**
 * sku信息
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "sku信息 管理")
@RestController
@RequestMapping("pms/pmssku")
public class PmsSkuController {
    @Autowired
    private PmsSkuService pmsSkuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmssku:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsSkuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:pmssku:info')")
    public Resp<PmsSkuEntity> info(@PathVariable("id") Long id){
		PmsSkuEntity pmsSku = pmsSkuService.getById(id);

        return Resp.ok(pmsSku);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmssku:save')")
    public Resp<Object> save(@RequestBody PmsSkuEntity pmsSku){
		pmsSkuService.save(pmsSku);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmssku:update')")
    public Resp<Object> update(@RequestBody PmsSkuEntity pmsSku){
		pmsSkuService.updateById(pmsSku);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmssku:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		pmsSkuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}