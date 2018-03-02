package com.zhxy.service.impl;

import com.zhxy.entity.Users;
import com.zhxy.mapper.UsersMapper;
import com.zhxy.service.IUsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
