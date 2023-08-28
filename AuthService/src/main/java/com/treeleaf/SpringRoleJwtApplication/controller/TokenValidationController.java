package com.treeleaf.SpringRoleJwtApplication.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TokenValidationController {

    @GetMapping("/token-validation")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("This is a secure endpoint!");
    }

}