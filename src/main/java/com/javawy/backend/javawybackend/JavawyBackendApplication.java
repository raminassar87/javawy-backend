package com.javawy.backend.javawybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class JavawyBackendApplication {

    @GetMapping("/")
    public String sayHi() {
        return "Welcome to Heroku Cloud solution";
    }

    @GetMapping("/message/{input}")
    public String getMessage(@PathVariable String input) {
        return "Welcome " + input;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavawyBackendApplication.class, args);
    }
}
