package com.zhxy.mapper;

import com.zhxy.entity.Orders;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhuxuanyu123
 * @since 2018-03-01
 */
public interface OrdersMapper extends BaseMapper<Orders> {
    List<Orders> findOrdersCustomersMap();
    List<Orders> findOrdersAndItemsMap();
}
