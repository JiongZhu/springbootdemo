package com.zhxy.mapper;

import com.zhxy.entity.Users;
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
public interface UsersMapper extends BaseMapper<Users> {
    List<Users> selectPageByAge(@Param("age") Integer age);
}
