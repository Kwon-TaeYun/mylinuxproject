package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "<html>" +
                "<head><style>" +
                "body { text-align: center; font-size: 2em; color: blue; }" +
                "</style></head>" +
                "<body>🎉 <b>Hello, World!</b> 🎉</body>" +
                "</html>";
    }
}
