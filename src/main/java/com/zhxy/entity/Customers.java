package com.zhxy.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Customers extends Model<Customers> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "custId", type = IdType.AUTO)
    private Integer custId;
    private String custName;
    private String custAddress;
    private String custCity;
    private String custState;
    private String custZip;
    private String custCountry;
    private String custContact;
    private String custEmail;

    private List<Orders> ordersList;
    @Override
    protected Serializable pkVal() {
        return this.custId;
    }

}
