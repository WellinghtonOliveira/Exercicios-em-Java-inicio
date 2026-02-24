package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!! I am learning Spring Boot ";
    }


    @GetMapping("/name")
    public String nome() {
        return "Hi! My name is Wellinghton O. Batista and learning Spring Boot";
    }
    
}
