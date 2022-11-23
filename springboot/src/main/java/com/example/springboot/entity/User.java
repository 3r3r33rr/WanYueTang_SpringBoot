package com.example.springboot.entity;

import lombok.Data;

@Data
public class User {
    //private Integer db_userid;
    //private String db_username;
    //private String db_pwd;
    //private String db_phone;
    //private String db_sex;
    //private String db_headimg;
    //private boolean db_flag;

    private Integer userid;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String headimg;
    private boolean flag;
}
