package com.example.sun.eurekaservice03.contraller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test03 {
    @RequestMapping("service1")
    public String test(){
        return "服务3";
    }
}
