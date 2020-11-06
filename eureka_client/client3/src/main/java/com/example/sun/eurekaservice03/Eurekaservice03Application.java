package com.example.sun.eurekaservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaservice03Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaservice03Application.class, args);
    }

}
