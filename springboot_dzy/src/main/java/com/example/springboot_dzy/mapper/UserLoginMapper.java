package com.example.springboot_dzy.mapper;

import com.example.springboot_dzy.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserLoginMapper {



    @Insert("insert into users(username,password) values (#{username},#{password})")
    int createUser(User user);
    @Select("select * from users ")
    List<User> find();
}
