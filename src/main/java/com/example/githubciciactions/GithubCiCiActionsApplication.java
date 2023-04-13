package com.example.githubciciactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiCiActionsApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from application";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCiActionsApplication.class, args);
    }

}
