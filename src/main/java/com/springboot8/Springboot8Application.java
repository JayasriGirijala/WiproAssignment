package com.springboot8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot8Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot8Application.class, args);
    }
}
/*http://localhost:8080/users --post
{
"firstName": "Jayasri",
"lastName": "Girijala",
"age": 21
}
User created: Jayasri Girijala, age 21*/