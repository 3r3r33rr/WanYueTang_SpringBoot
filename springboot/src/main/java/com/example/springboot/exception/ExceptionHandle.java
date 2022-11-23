package com.example.springboot.exception;

import com.example.springboot.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandle{

    @ExceptionHandler(value = Exception.class)
    public Result ExceptionError(Exception e){
        log.error("系统错误",e);
        return Result.error("系统错误");
    }
}
