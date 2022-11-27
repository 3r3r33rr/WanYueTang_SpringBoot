package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.controller.dto.LoginDTO;
import com.example.springboot.controller.request.LoginRequest;
import com.example.springboot.entity.User;
import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    //显示全部用户信息
    @GetMapping("list")
    public Result list(){
        List<User> users = userService.list();
        return Result.success(users);
    }

    //用户登录
    @PostMapping("login")
    public Result login(@RequestBody LoginRequest request){
        LoginDTO loginDTO = userService.login(request);
        return Result.success(loginDTO);
    }

    //用户注册
    @PostMapping("register")
    public Result register(@RequestBody User user){
        userService.register(user);
        return Result.success();
    }
}
