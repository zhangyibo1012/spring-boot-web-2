package com.edu.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: GloableExceptionHandler.java
 * @Package com.edu.common
 * @Description: 全局异常
 * @Author ZhangYB
 * @Date 2018-05-20 11:24
 * @Version V1.0
 */
@ControllerAdvice
public class GloableExceptionHandler  {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String errorHandler(Exception e) {
        return "global error" + e.getClass().getName();
    }
}
