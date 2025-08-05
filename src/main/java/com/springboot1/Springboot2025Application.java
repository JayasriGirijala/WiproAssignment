package com.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2025Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot2025Application.class, args);

        ClassKLM klm = context.getBean(ClassKLM.class);
        klm.run(); // Output: Hi... I am ClassABC
    }
}
// Output: Hi... I am ClassABC