package com.springboot2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class PropertyReader {

    @Value("${app.example.integer-value}")
    private Integer valueInteger;

    @Value("${app.example.decimal-value}")
    private Double valueDouble;

    @Value("${app.example.boolean-value}")
    private Boolean valueBoolean;

    @PostConstruct
    public void printValues() {
        System.out.println("Integer Value: " + valueInteger);
        System.out.println("Decimal Value: " + valueDouble);
        System.out.println("Boolean Value: " + valueBoolean);
    }
}
