package com.zhxy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhxy.mapper.CustomersMapper;
import com.zhxy.mapper.OrdersMapper;
import com.zhxy.mapper.ProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/mybatis")
public class MybatisTestController {

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private CustomersMapper customersMapper;
    @Autowired
    private ProductsMapper productsMapper;

    @RequestMapping(value = "/oneonone",method = RequestMethod.GET)
    @ResponseBody
    public String getOrdersList1() throws JsonProcessingException {
        Map<String,Object> map = new HashMap();
        map.put("oneonone", ordersMapper.findOrdersCustomersMap());
        String json = mapper.writeValueAsString(map);
        return json;
    }

    @RequestMapping(value = "/onetomany",method = RequestMethod.GET)
    @ResponseBody
    public String getOrdersList2() throws JsonProcessingException {
        Map<String,Object> map = new HashMap();
        map.put("onetomany", ordersMapper.findOrdersAndItemsMap());
        String json = mapper.writeValueAsString(map);
        return json;
    }

    @RequestMapping(value = "/manytomany",method = RequestMethod.GET)
    @ResponseBody
    public String getCustomersList() throws JsonProcessingException {
        Map<String,Object> map = new HashMap();
        map.put("manytomany", customersMapper.findCustomerProducts());
        String json = mapper.writeValueAsString(map);
        return json;
    }

    @RequestMapping(value = "/if",method = RequestMethod.GET)
    @ResponseBody
    public String getProductsList() throws JsonProcessingException {
        Map<String,Object> map = new HashMap();
        map.put("if", productsMapper.findProductList("鞋"));
        String json = mapper.writeValueAsString(map);
        return json;
    }

    @RequestMapping(value = "/if2",method = RequestMethod.GET)
    @ResponseBody
    public String getProductsList2() throws JsonProcessingException {
        Map<String,Object> map = new HashMap();
        map.put("if2", productsMapper.findProductList2("鞋"));
        String json = mapper.writeValueAsString(map);
        return json;
    }

    @RequestMapping(value = "/set",method = RequestMethod.GET)
    @ResponseBody
    public String updateProduct() throws JsonProcessingException {
        productsMapper.updateProduct("外套","30005");
        return "da";
    }

    @RequestMapping(value = "/foreach",method = RequestMethod.GET)
    @ResponseBody
    public String selectsProducts() throws JsonProcessingException {
        List<String> prodId = new ArrayList<>();
        prodId.add("30003");
        prodId.add("30004");
        prodId.add("30005");
        Map<String,Object> map = new HashMap();
        map.put("foreach",productsMapper.findProductListByProdId(prodId));
        String json = mapper.writeValueAsString(map);
        return json;
    }
}
