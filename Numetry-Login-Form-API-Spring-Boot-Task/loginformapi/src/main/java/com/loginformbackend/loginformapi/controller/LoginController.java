package com.loginformbackend.loginformapi.controller;

import com.loginformbackend.loginformapi.model.Login;
import com.loginformbackend.loginformapi.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @PostMapping("/login")
    Login newLogin(@RequestBody Login newLogin) { return loginRepository.save(newLogin); }

    @GetMapping("/logins")
    List<Login> getAllLogins() { return loginRepository.findAll(); }
}
