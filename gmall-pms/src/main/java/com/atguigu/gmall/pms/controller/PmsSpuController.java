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

import com.atguigu.gmall.pms.entity.PmsSpuEntity;
import com.atguigu.gmall.pms.service.PmsSpuService;




/**
 * spu信息
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "spu信息 管理")
@RestController
@RequestMapping("pms/pmsspu")
public class PmsSpuController {
    @Autowired
    private PmsSpuService pmsSpuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmsspu:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsSpuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:pmsspu:info')")
    public Resp<PmsSpuEntity> info(@PathVariable("id") Long id){
		PmsSpuEntity pmsSpu = pmsSpuService.getById(id);

        return Resp.ok(pmsSpu);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmsspu:save')")
    public Resp<Object> save(@RequestBody PmsSpuEntity pmsSpu){
		pmsSpuService.save(pmsSpu);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmsspu:update')")
    public Resp<Object> update(@RequestBody PmsSpuEntity pmsSpu){
		pmsSpuService.updateById(pmsSpu);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmsspu:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		pmsSpuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
