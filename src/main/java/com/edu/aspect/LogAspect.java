package com.edu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Title: LogAspect.java
 * @Package com.edu.aspect
 * @Description:  aop实现
 *                 1.spring-boot-starter-aop引入依赖，默认就开启了aop支持
 *                 2.写一个Aspect(方面)类，添加注解@Aspect ，封装横切关注点(日志 监控等等) ，需要配置通知(前置 后置等等)和切入点(那些包的哪些类的哪些方法)
 *                 3.这个Aspect类需要纳入spring容器
 *                  JoinPoint 可以拿到执行的上下文类参数方法
 *
 * @Author ZhangYB
 * @Date 2018-05-20 13:35
 * @Version V1.0
 */
@Aspect
@Component
public class LogAspect {

    //方法之前调用  这个包的所有子包
    @Before("execution(* com.edu.dao ..*.*(..))")
    public void log(){
        System.out.println(" Before method log  done");
    }

    //后置通知 拿到类完全名和参数和方法名
    @After("execution(* com.edu.dao ..*.*(..))")
    public void logAfter(JoinPoint point){
        System.out.println("After method log  done" + point.getTarget().getClass() + ",args:" + Arrays.asList(point.getArgs()) + ",method:" + point.getSignature().getName());
    }
}
