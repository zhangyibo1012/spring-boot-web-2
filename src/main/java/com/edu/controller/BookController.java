package com.edu.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * @Title: BookCOntroller.java
 * @Package com.edu.controller
 * @Description: 只可以处理当前controller种的异常
 *              优先使用本controller中的处理器，如果本controller没有异常处理，就去使用全局的异常处理
 * @Author ZhangYB
 * @Date 2018-05-20 11:06
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "book")
public class BookController {

    /**
     * 可以指定拦截哪些异常
     *  @ExceptionHandler(value = FileNotFoundException.class)
     *  也可以全都拦截
     *   @ExceptionHandler(value = Exception.class)
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public String error(Exception e){
        return " exception:" + e.getMessage();
    }

    @GetMapping(value = "error1")
    public String error1() throws FileNotFoundException{
        throw  new FileNotFoundException("book.txt file not found");
    }

    @GetMapping(value = "error2")
    public String error2() throws ClassNotFoundException{
        throw  new ClassNotFoundException("Book class not found");
    }
}
