package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/hello")
    public String hello() {
        List<User> user = userRepository.findAll();
        return "Hello World";
    }
}
