package com.edu.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Title: MyHealthIndicator.java
 * @Package com.edu.health
 * @Description: 自定义健康检查
 *                 实现HealthIndicator接口，并且纳入spring容器中管理
 * @Author ZhangYB
 * @Date 2018-05-20 16:13
 * @Version V1.0
 */
@Component
public class MyHealthIndicator implements HealthIndicator{

    @Override
    public Health health() {
        return Health.up().withDetail("error" ,"spring boot error").build();
    }
}
