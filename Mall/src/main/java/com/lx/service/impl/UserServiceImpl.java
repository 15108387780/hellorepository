package com.lx.service.impl;

import com.lx.mapper.UserMapper;
import com.lx.domain.User;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
         return userMapper.selectByPrimaryKey(id);
    }
}
