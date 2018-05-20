package com.edu.common;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @Title: CommonErrorPage.java
 * @Package com.edu
 * @Description: 异常错误指定页面
 * @Author ZhangYB
 * @Date 2018-05-20 10:50
 * @Version V1.0
 */
//@Component
public class CommonErrorPageRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {

        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND , "/404.html");

        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR , "/500.html");

        ErrorPage args = new ErrorPage(IllegalArgumentException.class , "/args.html");


        registry.addErrorPages(e404 , e500 ,args);
    }
}
