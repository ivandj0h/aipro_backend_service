package com.ivandjoh.aipro_backend_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class HomeController {

    @GetMapping("home")
    public ResponseEntity<List<String>> home() {
        return ResponseEntity.ok(List.of("Hello", "World"));
    }

    @GetMapping("name")
    public String name(Principal p) {
        return "Hello " + p.getName();
    }
}
