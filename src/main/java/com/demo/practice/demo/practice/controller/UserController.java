package com.demo.practice.demo.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/user")
    public String getUser() {
        return "Success";
    }
}
