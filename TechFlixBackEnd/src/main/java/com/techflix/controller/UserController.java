package com.techflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.techflix.model.User;
import com.techflix.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // Permitir requisições de qualquer origem (CORS)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.loginUser(user);
    }
}
