package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 23:28:42
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

