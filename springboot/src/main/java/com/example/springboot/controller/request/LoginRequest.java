package com.example.springboot.controller.request;

import lombok.Data;

@Data
public class LoginRequest {
    //private String db_username;
    //private String db_pwd;

    private String username;
    private String password;
}


