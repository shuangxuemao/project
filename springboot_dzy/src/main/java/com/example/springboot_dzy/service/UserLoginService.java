package com.example.springboot_dzy.service;

import com.example.springboot_dzy.pojo.User;

import java.util.List;

public interface UserLoginService {

   

    int createUser(User user);

    List<User> find();
}
