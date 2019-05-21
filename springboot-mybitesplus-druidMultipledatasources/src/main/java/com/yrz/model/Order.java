package com.yrz.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
  
 * @author yrz
 */
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
@TableName("t_order")
public class Order extends Model<Order> {

    @Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", userId=" + userId + ", price=" + price + ", paidTime="
				+ paidTime + ", createTime=" + createTime + ", modifyTime=" + modifyTime + "]";
	}

	private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单号
     */
    @TableField("order_no")
    private String orderNo;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 支付金额
     */
    private BigDecimal price;
    /**
     * 支付时间
     */
    @TableField("paid_time")
    private Date paidTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
