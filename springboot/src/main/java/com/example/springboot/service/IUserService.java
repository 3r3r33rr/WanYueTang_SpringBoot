package com.example.springboot.service;

import com.example.springboot.controller.dto.LoginDTO;
import com.example.springboot.controller.request.LoginRequest;
import com.example.springboot.entity.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    LoginDTO login(LoginRequest request);
}
