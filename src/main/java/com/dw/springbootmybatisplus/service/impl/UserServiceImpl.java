package com.dw.springbootmybatisplus.service.impl;

import com.dw.springbootmybatisplus.entity.User;
import com.dw.springbootmybatisplus.mapper.UserMapper;
import com.dw.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }
}
