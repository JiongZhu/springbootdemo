package com.zhxy.mapper;

import com.zhxy.entity.Products;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhuxuanyu123
 * @since 2018-03-01
 */
public interface ProductsMapper extends BaseMapper<Products> {
    List<Products> findProductList(@Param("prodName")String prodName);
    List<Products> findProductList2(@Param("prodName")String prodName);
    void updateProduct(@Param("prodName")String prodName,@Param("prodId")String prodId);
    List<Products> findProductListByProdId(List<String> prodId);
}
