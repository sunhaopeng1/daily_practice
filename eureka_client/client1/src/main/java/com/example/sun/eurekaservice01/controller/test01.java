package com.example.sun.eurekaservice01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test01 {

    @RequestMapping("service1")
    public String test(){
        return "服务1";
    }
}
