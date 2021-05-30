package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品三级分类
 * 
 * @author lf
 * @email lf@163.com
 * @date 2021-05-30 21:58:59
 */
@ApiModel
@Data
@TableName("pms_category")
public class PmsCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "分类id")
	private Long id;
	/**
	 * 分类名称
	 */
	@ApiModelProperty(name = "name",value = "分类名称")
	private String name;
	/**
	 * 父分类id
	 */
	@ApiModelProperty(name = "parentId",value = "父分类id")
	private Long parentId;
	/**
	 * 是否显示[0-不显示，1显示]
	 */
	@ApiModelProperty(name = "status",value = "是否显示[0-不显示，1显示]")
	private Integer status;
	/**
	 * 排序
	 */
	@ApiModelProperty(name = "sort",value = "排序")
	private Integer sort;
	/**
	 * 图标地址
	 */
	@ApiModelProperty(name = "icon",value = "图标地址")
	private String icon;
	/**
	 * 计量单位
	 */
	@ApiModelProperty(name = "unit",value = "计量单位")
	private String unit;

}
