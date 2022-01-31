package com.mx.controller;

import com.mx.annotation.Annotation4Swagger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class MyController {
    @PostMapping("/post")
    public String post() {
        return "post";
    }

    @GetMapping("/get")
    public String get(String a, String b) {
        return "get";
    }

    @Annotation4Swagger
    @RequestMapping("/req")
    public String req(String m) {
        return "req";
    }

}
