package com.edu.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @Title: UserDao.java
 * @Package com.edu.dao
 * @Description: TODO
 * @Author ZhangYB
 * @Date 2018-05-20 13:25
 * @Version V1.0
 */
@Repository
@Slf4j
public class UserDao {

    public void  log(){
        log.debug("user dao debug log");
        log.info("user dao info log");
        log.warn("user dao warn log");
        log.error("user dao error log");

    }

    public void add(String username , String password){
        System.out.println("add [ username :" + username + ", password: " + password + "]");
    }
}
