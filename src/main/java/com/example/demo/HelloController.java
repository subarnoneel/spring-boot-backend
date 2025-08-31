package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://sample-50258.web.app")
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot Backend!";
    }
}