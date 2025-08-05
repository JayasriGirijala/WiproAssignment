package com.springboot5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

    @GetMapping("/example/test")
    public String redirectToTest2() {
        // This simulates a redirect — you could also return a redirect explicitly
        return "Redirecting to /example/test2...";
    }

    @GetMapping("/example/test2")
    public String test2() {
        return "You've been redirected to /example/test2!";
    }
}
