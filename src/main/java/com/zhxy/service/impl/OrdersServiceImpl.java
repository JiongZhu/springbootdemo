package com.zhxy.service.impl;

import com.zhxy.entity.Orders;
import com.zhxy.mapper.OrdersMapper;
import com.zhxy.service.IOrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
