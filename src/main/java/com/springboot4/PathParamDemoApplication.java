package com.springboot4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PathParamDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PathParamDemoApplication.class, args);
    }
}
//User ID: 101, Type: savings, Status: active
//http://localhost:8080/users/101/accounts?type=savings&status=active
