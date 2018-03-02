package com.zhxy.mapper;

import com.zhxy.entity.Customers;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhuxuanyu123
 * @since 2018-03-01
 */
public interface CustomersMapper extends BaseMapper<Customers> {
    List<Customers> findCustomerProducts();
}
