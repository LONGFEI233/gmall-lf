package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku信息
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@ApiModel
@Data
@TableName("pms_sku")
public class PmsSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "skuId")
	private Long id;
	/**
	 * spuId
	 */
	@ApiModelProperty(name = "spuId",value = "spuId")
	private Long spuId;
	/**
	 * sku名称
	 */
	@ApiModelProperty(name = "name",value = "sku名称")
	private String name;
	/**
	 * 所属分类id
	 */
	@ApiModelProperty(name = "catagoryId",value = "所属分类id")
	private Long catagoryId;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "brandId",value = "品牌id")
	private Long brandId;
	/**
	 * 默认图片
	 */
	@ApiModelProperty(name = "defaultImage",value = "默认图片")
	private String defaultImage;
	/**
	 * 标题
	 */
	@ApiModelProperty(name = "title",value = "标题")
	private String title;
	/**
	 * 副标题
	 */
	@ApiModelProperty(name = "subtitle",value = "副标题")
	private String subtitle;
	/**
	 * 价格
	 */
	@ApiModelProperty(name = "price",value = "价格")
	private BigDecimal price;
	/**
	 * 重量（克）
	 */
	@ApiModelProperty(name = "weight",value = "重量（克）")
	private Integer weight;

}
