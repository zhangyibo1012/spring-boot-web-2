package com.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: UserController.java
 * @Package com.edu.controller
 * @Description: TODO
 * @Author ZhangYB
 * @Date 2018-05-20 10:07
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping(value = "home")
    public String home() {
        System.out.println("--------user home-----------");
        return "user home";
    }

    @GetMapping(value = "help")
    public String help() {
        throw new IllegalArgumentException("args is empty");
    }

    @GetMapping(value = "null")
    public String empty() {
        throw new NullPointerException("args is empty");
    }
}
