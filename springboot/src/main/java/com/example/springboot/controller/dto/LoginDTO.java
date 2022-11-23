package com.example.springboot.controller.dto;

import lombok.Data;

//封装要返回的数据
@Data
public class LoginDTO {
    private Integer userid;
    private String username;
    private String phone;
    private String sex;
    private String headimg;
    private boolean flag;

    //private Integer db_userid;
    //private String db_username;
    //private String db_phone;
    //private String db_sex;
    //private String db_headimg;
    //private boolean db_flag;
}
