package com.edu.config;


import com.edu.interceptor.LoginHandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Title: WebConfiguration.java
 * @Package com.edu.config
 * @Description: 配置拦截器
 * @Author ZhangYB
 * @Date 2018-05-20 10:16
 * @Version V1.0
 */
//@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor());
    }
}
