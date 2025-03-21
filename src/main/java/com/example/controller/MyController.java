package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "Docker") String name) {
        return "🚀 Hello, " + name + "! Welcome to Spring Boot on Docker! 🐳";
    }

    @GetMapping("/ping")
    public String ping() {
        return "🏓 Pong! Your Spring Boot app is running inside Docker!";
    }

    // ✅ 1. 랜덤 농담 API
    @GetMapping("/random-joke")
    public String getRandomJoke() {
        List<String> jokes = Arrays.asList(
                "🤣 왜 개발자는 집을 짓지 않을까? -> 이미 너무 많은 버그가 있어서!",
                "😂 왜 자바 개발자는 눈을 감고 코딩할까? -> 너무 많은 NullPointerException을 보기 싫어서!",
                "😆 왜 프로그래머는 바다에서 수영을 하지 않을까? -> 너무 많은 C(씨)가 있어서!"
        );
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    // ✅ 2. 문자열 뒤집기 API
    @GetMapping("/reverse")
    public String reverseString(@RequestParam String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // ✅ 3. 현재 시간 반환 API
    @GetMapping("/time")
    public String getCurrentTime() {
        return "⏰ 현재 서버 시간: " + LocalDateTime.now();
    }

    // ✅ 4. 서비스 상태 체크 API
    @GetMapping("/status")
    public String getStatus() {
        return "✅ Spring Boot 서비스가 정상적으로 실행 중입니다! 🚀";
    }
}
