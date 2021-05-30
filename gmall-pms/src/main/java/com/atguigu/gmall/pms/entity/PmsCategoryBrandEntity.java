package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌分类关联
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@ApiModel
@Data
@TableName("pms_category_brand")
public class PmsCategoryBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "brandId",value = "品牌id")
	private Long brandId;
	/**
	 * 分类id
	 */
	@ApiModelProperty(name = "categoryId",value = "分类id")
	private Long categoryId;
	/**
	 * 品牌名称
	 */
	@ApiModelProperty(name = "brandName",value = "品牌名称")
	private String brandName;
	/**
	 * 分类名称
	 */
	@ApiModelProperty(name = "categoryName",value = "分类名称")
	private String categoryName;

}
