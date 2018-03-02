package com.zhxy.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
public class Vendors extends Model<Vendors> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vendId", type = IdType.AUTO)
    private Integer vendId;
    private String vendName;
    private String vendAddress;
    private String vendCity;
    private String vendState;
    private String vendZip;
    private String vendCountry;


    @Override
    protected Serializable pkVal() {
        return this.vendId;
    }

}
