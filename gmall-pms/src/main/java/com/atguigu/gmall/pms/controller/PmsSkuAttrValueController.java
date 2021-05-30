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

import com.atguigu.gmall.pms.entity.PmsSkuAttrValueEntity;
import com.atguigu.gmall.pms.service.PmsSkuAttrValueService;




/**
 * sku销售属性&值
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "sku销售属性&值 管理")
@RestController
@RequestMapping("pms/pmsskuattrvalue")
public class PmsSkuAttrValueController {
    @Autowired
    private PmsSkuAttrValueService pmsSkuAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmsskuattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsSkuAttrValueService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:pmsskuattrvalue:info')")
    public Resp<PmsSkuAttrValueEntity> info(@PathVariable("id") Long id){
		PmsSkuAttrValueEntity pmsSkuAttrValue = pmsSkuAttrValueService.getById(id);

        return Resp.ok(pmsSkuAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmsskuattrvalue:save')")
    public Resp<Object> save(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
		pmsSkuAttrValueService.save(pmsSkuAttrValue);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmsskuattrvalue:update')")
    public Resp<Object> update(@RequestBody PmsSkuAttrValueEntity pmsSkuAttrValue){
		pmsSkuAttrValueService.updateById(pmsSkuAttrValue);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmsskuattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		pmsSkuAttrValueService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
