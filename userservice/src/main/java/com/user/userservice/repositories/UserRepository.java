package com.user.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.userservice.entities.User;

public interface UserRepository extends JpaRepository<User , String>{
    
}
