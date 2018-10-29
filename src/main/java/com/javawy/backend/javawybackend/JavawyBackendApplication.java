package com.javawy.backend.javawybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RequestMapping("message")
@RestController
public class JavawyBackendApplication {

    @GetMapping("/hi")
    public String sayHi() {
        return "Welcome to Heroku Cloud solution";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(JavawyBackendApplication.class, args);
    }
}
