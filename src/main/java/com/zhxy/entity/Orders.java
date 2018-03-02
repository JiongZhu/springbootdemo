package com.zhxy.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhuxuanyu123
 * @since 2018-03-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "orderNum", type = IdType.AUTO)
    private Integer orderNum;
    private Date orderDate;
    private Integer custId;

    private Customers customers;

    private List<Orderitems> orderitems;
    @Override
    protected Serializable pkVal() {
        return this.orderNum;
    }

}
