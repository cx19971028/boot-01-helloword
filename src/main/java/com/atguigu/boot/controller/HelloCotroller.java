package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
// @RestController 包括@ResponseBody和@Controller
@RestController
public class HelloCotroller {
    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public String handler01(String name){
        return "Hello, SpringBoot 2!" + name;
    }

    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
