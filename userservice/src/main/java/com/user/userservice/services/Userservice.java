package com.user.userservice.services;

import java.util.List;

import com.user.userservice.entities.User;

public interface Userservice {
   //create
    User saveUser(User user);

  //read all
  List<User> getAllUsers();

  //read 
  User getUser(String userId);
     
}
