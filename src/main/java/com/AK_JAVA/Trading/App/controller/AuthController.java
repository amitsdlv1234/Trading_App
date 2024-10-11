package com.AK_JAVA.Trading.App.controller;

import com.AK_JAVA.Trading.App.Model.User;
import com.AK_JAVA.Trading.App.repository.UserRepository;
import com.AK_JAVA.Trading.App.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){
        return new ResponseEntity<>(authService.registration(user), HttpStatus.CREATED);
    }
}
