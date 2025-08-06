package com.springboot16p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestTemplateApplication.class, args);
    }
}
/*GET       http://localhost:8080/api/posts

GET        http://localhost:8080/api/posts/1

POST http://localhost:8080/api/posts

PUT http://localhost:8080/api/posts/1

DELETE http://localhost:8080/api/posts/1

*/