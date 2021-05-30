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

import com.atguigu.gmall.pms.entity.PmsCategoryBrandEntity;
import com.atguigu.gmall.pms.service.PmsCategoryBrandService;




/**
 * 品牌分类关联
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "品牌分类关联 管理")
@RestController
@RequestMapping("pms/pmscategorybrand")
public class PmsCategoryBrandController {
    @Autowired
    private PmsCategoryBrandService pmsCategoryBrandService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmscategorybrand:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsCategoryBrandService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:pmscategorybrand:info')")
    public Resp<PmsCategoryBrandEntity> info(@PathVariable("id") Long id){
		PmsCategoryBrandEntity pmsCategoryBrand = pmsCategoryBrandService.getById(id);

        return Resp.ok(pmsCategoryBrand);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmscategorybrand:save')")
    public Resp<Object> save(@RequestBody PmsCategoryBrandEntity pmsCategoryBrand){
		pmsCategoryBrandService.save(pmsCategoryBrand);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmscategorybrand:update')")
    public Resp<Object> update(@RequestBody PmsCategoryBrandEntity pmsCategoryBrand){
		pmsCategoryBrandService.updateById(pmsCategoryBrand);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmscategorybrand:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		pmsCategoryBrandService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
