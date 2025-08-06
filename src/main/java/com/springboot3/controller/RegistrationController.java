package com.springboot3.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController // <--- Use this instead of @Controller
public class RegistrationController {

    @PostMapping("/register")
    public Map<String, Object> submitForm(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("email") String email,
            @RequestParam("birthday") String birthday,
            @RequestParam("profession") String profession
    ) {
        Map<String, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("password", password);
        response.put("email", email);
        response.put("birthday", birthday);
        response.put("profession", profession);
        response.put("status", "success");

        return response;
    }
}

