package com.tsl.QuizWebApp.repo;


import com.tsl.QuizWebApp.model.CustomUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<CustomUserDetails, Integer> {
    CustomUserDetails findByUsername(String username);
}
