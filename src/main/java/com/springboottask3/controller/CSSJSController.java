package com.springboottask3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CSSJSController {

    @GetMapping("/")
    public String index() {
        return "index"; // This should map to src/main/resources/templates/index.html if using Thymeleaf
    }
}
