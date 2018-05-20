package com.edu.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Title: LoginHandlerInterceptor.java
 * @Package com.edu.interceptor
 * @Description: TODO
 * @Author ZhangYB
 * @Date 2018-05-20 10:12
 * @Version V1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    /**
     * controller 执行之前执行这个方法
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("==========preHandle============" + handler.getClass());
        return true;
    }

    /**
     * controller 执行之后且页面渲染之前执行这个方法
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("==========postHandle============");
    }

    /**
     * 页面渲染之后调用，一般用于资源清理
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("==========afterCompletion============");
    }
}
