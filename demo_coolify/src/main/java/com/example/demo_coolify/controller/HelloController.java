package com.example.demo_coolify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        System.out.println("Hello Coolify");
        return "Hello Coolify";
    }
}
