package com.zipkinTask22.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinOrderServiceApplication.class, args);
    }
}
//http://localhost:8081/order/1
//http://localhost:8082/payments/1

