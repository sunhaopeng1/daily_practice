package com.example.sun.eurekaservice04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaservice04Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice04Application.class, args);
    }

}
