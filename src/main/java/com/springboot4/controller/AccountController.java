package com.springboot4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @GetMapping("/users/{userId}/accounts")
    public String getAccountDetails(@PathVariable int userId,
                                    @RequestParam String type,
                                    @RequestParam String status) {
        return "User ID: " + userId + ", Type: " + type + ", Status: " + status;
    }
}
