package com.example.finalproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class testController {
    @GetMapping
    public ResponseEntity <String> sayHello(){
        return ResponseEntity.ok("hello from secured endponit");
    }
}
