package com.example.demo.config;

import com.example.demo.resule.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 统一异常处理
 * 捕获到的异常全部在这里进行处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    public Result error(MyException e){
        e.printStackTrace();
        return Result.build(null , e.getResultCodeEnum()) ;
    }
}
