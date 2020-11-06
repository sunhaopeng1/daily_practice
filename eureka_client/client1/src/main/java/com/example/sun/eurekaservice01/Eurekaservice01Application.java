package com.example.sun.eurekaservice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaservice01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice01Application.class, args);
    }

}
