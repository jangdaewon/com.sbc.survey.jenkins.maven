package com.sbc.survey.jenkins.maven.controller;

import com.sbc.survey.jenkins.maven.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting(12345L, "Hello Daewon!");
    }
}
