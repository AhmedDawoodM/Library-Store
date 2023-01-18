package com.passboard.challenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class TestController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello Passboard!");
    }
}
