package com.springboot10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootassi10Application {
    public static void main(String[] args) {
        SpringApplication.run(Springbootassi10Application.class, args);
    }
}
//http://localhost:8080/cust/save    --post
/*{
"name": "John Doe",
"email": "john.doe@example.com",
"age": 30,
"gender": "Male",
"birthday": "1995-08-05",
"phone": "123-456-7890"
}
*/