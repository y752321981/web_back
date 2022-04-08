package com.yin.web_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main/api")
public class MainController {

    @PostMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }
}

