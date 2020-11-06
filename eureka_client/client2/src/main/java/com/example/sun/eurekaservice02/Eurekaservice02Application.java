package com.example.sun.eurekaservice02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaservice02Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice02Application.class, args);
    }

}
