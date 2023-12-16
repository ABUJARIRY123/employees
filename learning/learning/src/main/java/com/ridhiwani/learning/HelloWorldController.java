package com.ridhiwani.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Welcome to Spring, and learn Spring Boot";
    }
}
