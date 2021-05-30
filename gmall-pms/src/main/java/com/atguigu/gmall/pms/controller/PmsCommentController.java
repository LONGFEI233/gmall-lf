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

import com.atguigu.gmall.pms.entity.PmsCommentEntity;
import com.atguigu.gmall.pms.service.PmsCommentService;




/**
 * 商品评价
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@Api(tags = "商品评价 管理")
@RestController
@RequestMapping("pms/pmscomment")
public class PmsCommentController {
    @Autowired
    private PmsCommentService pmsCommentService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:pmscomment:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = pmsCommentService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:pmscomment:info')")
    public Resp<PmsCommentEntity> info(@PathVariable("id") Long id){
		PmsCommentEntity pmsComment = pmsCommentService.getById(id);

        return Resp.ok(pmsComment);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:pmscomment:save')")
    public Resp<Object> save(@RequestBody PmsCommentEntity pmsComment){
		pmsCommentService.save(pmsComment);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:pmscomment:update')")
    public Resp<Object> update(@RequestBody PmsCommentEntity pmsComment){
		pmsCommentService.updateById(pmsComment);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:pmscomment:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		pmsCommentService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
