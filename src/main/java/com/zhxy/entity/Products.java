package com.zhxy.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.Version;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Products extends Model<Products> {

    private static final long serialVersionUID = 1L;

    private String prodId;
    private Integer vendId;
    private String prodName;
    private BigDecimal prodPrice;
    private String prodDesc;


    @Override
    protected Serializable pkVal() {
        return this.prodId;
    }

}
