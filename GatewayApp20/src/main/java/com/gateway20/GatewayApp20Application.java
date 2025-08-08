package com.gateway20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApp20Application {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp20Application.class, args);
    }
}

//http://localhost:8080/employee/test
// Employee Service is Working! Received Header: Gateway-Active