package com.example.usersapi.controller;

import com.example.usersapi.model.User;
import com.example.usersapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    @Autowired
    UserService userService;

    //ENDPOINT THAT ALLOWS A USER TO SIGN UP / REFER TO USER SERVICE
    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User newUser) {
        //return userService.createUser(newUser);
        return ResponseEntity.ok(new JwtResponse(userService.createUser(newUser)));
    }

    //ENDPOINT THAT ALLOWS A USER TO LOG IN / REFER TO USER SERVICE
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }

    //ENDPOINT THAT SHOWS A USER LIST / REFER TO USER SERVICE

    @GetMapping("/logout")
    public String helloWorld4() {
        return "Hello World!! You just logged out!";
    }

}
