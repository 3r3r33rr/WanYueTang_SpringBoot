package com.example.springboot.mapper;

import com.example.springboot.controller.request.LoginRequest;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> list();

    User getUserNameAndPassword(LoginRequest request);

    void register(User user);

    User checkUserName(User user);
}
