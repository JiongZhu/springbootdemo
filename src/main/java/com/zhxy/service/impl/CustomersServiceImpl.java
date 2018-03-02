package com.zhxy.service.impl;

import com.zhxy.entity.Customers;
import com.zhxy.mapper.CustomersMapper;
import com.zhxy.service.ICustomersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuxuanyu123
 * @since 2018-03-01
 */
@Service
public class CustomersServiceImpl extends ServiceImpl<CustomersMapper, Customers> implements ICustomersService {

}
