package com.user.userservice.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.userservice.entities.User;
import com.user.userservice.repositories.UserRepository;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        // Generate a random UUID and set it as the ID for the user
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId); // Ensure the User entity has a setId method

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null); // Or handle as needed, e.g., throw an exception or return an empty object
    }
}
