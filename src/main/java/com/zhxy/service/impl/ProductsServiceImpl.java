package com.zhxy.service.impl;

import com.zhxy.entity.Products;
import com.zhxy.mapper.ProductsMapper;
import com.zhxy.service.IProductsService;
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
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements IProductsService {

}
