package com.bmmt.demo.controllers;

import com.bmmt.demo.entities.User;
import com.bmmt.demo.services.AccountService;
import com.bmmt.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public ResponseEntity<User>create(User user) {
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }
}

