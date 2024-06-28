package com.example.springboot_dzy.service.Impl;

import com.example.springboot_dzy.mapper.UserLoginMapper;
import com.example.springboot_dzy.pojo.User;
import com.example.springboot_dzy.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    UserLoginMapper userLoginMapper;



    @Override
    public int createUser(User user) {
        return userLoginMapper.createUser(user);
    }

    @Override
    public List<User> find() {
        List<User> users = userLoginMapper.find();

        return users;
    }
}
