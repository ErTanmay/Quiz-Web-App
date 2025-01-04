package com.tsl.QuizWebApp.controller;

import com.tsl.QuizWebApp.model.CustomUserDetails;
import com.tsl.QuizWebApp.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private RegisterUserService registerUserService;

    @PostMapping("/register")
    public CustomUserDetails registerUser (@RequestBody CustomUserDetails user){
        return registerUserService.registerUser(user);
    }

    @GetMapping("/getUser/{id}")
    public CustomUserDetails getUserDetails(@PathVariable("id") int id){
        return registerUserService.getUserDetails(id);
    }
}
