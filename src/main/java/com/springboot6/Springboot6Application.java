package com.springboot6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot6Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot6Application.class, args); 
    }
}
//http://localhost:8080/api/students/register ---post
/*{
"name": "Jayasri",
"age": 20,
"email": "jayasri@example.com"
}
Student Registered Successfully!*/