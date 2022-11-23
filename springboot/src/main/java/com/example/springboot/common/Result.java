package com.example.springboot.common;

import lombok.Data;

@Data
public class Result {
    private String code;
    private Object data;
    private String msg;

    private static final String SUCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCESS_CODE);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCESS_CODE);
        result.setData(data);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }
}
