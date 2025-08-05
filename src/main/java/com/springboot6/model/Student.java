package com.springboot6.model;

import jakarta.validation.constraints.*;

public class Student {

    @NotBlank(message = "{student.name.notblank}")
    private String name;

    @Min(value = 18, message = "{student.age.min}")
    private int age;

    @Email(message = "{student.email.valid}")
    private String email;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}