package com.tsl.QuizWebApp.service;

import com.tsl.QuizWebApp.model.CustomUserDetails;
import com.tsl.QuizWebApp.repo.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public CustomUserDetails registerUser(CustomUserDetails user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userDetailsRepo.save(user);

    }

    public CustomUserDetails getUserDetails(int id) {
        return userDetailsRepo.findById(id).orElse(null);
    }
}
