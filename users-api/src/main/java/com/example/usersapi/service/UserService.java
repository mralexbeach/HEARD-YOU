package com.example.usersapi.service;

import com.example.usersapi.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    public User searchById(long id);

    public HttpStatus deleteUser(long id);

    public HttpStatus createUser(User user);

    public HttpStatus updateUser(long id, User userRequest);

    public HttpStatus searchByEmail(String email);

    public UserDetails loadUserByUsername(String username);
}