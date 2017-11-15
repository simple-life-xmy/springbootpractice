package com.xmy.springbootpractice.service.impl;

import com.xmy.springbootpractice.domain.User;
import com.xmy.springbootpractice.repository.UserMapper;
import com.xmy.springbootpractice.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xmy
 */
@Service
public class UserServiceImpl implements IUserService{

    @Resource
    UserMapper userMapper;

    @Override
    public User get(Long id) {
        return userMapper.get(id);
    }

    @Override
    public List<User> list() {
        return userMapper.all();
    }
}
