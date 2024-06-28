package com.example.springboot_dzy.controller;

import com.example.springboot_dzy.pojo.User;
import com.example.springboot_dzy.service.UserLoginService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/login")
    public String login(){
        User user1 = new User();
        List<User> users = userLoginService.find();
        return "11";

    }

}
