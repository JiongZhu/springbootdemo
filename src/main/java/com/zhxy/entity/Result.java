package com.zhxy.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

/**
 * 统一API响应结果封装
 */
@Getter
@Setter
public class Result<T> {
        private Integer code;
        private String msg;
        private T data;

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return e.toString();
        }
    }
}