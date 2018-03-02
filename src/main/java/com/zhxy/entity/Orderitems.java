package com.zhxy.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

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
public class Orderitems extends Model<Orderitems> {

    private static final long serialVersionUID = 1L;

    private Integer orderNum;
    private Integer orderItem;
    private String prodId;
    private Integer quantity;
    private BigDecimal itemPrice;

    private Products products;
    @Override
    protected Serializable pkVal() {
        return this.orderNum;
    }

}
