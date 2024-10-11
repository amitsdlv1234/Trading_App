package com.AK_JAVA.Trading.App.services;

import com.AK_JAVA.Trading.App.Model.User;
import com.AK_JAVA.Trading.App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User registration(User user){
       System.out.println(user);
        User newUser=new User();
        newUser.setFullName(user.getFullName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());

        User savedUser=userRepository.save(newUser);

        return savedUser;
    }
}
