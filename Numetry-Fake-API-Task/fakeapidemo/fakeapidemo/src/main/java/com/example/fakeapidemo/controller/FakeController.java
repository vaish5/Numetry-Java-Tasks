package com.example.fakeapidemo.controller;

import com.example.fakeapidemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FakeController {

    @GetMapping("/users")
    public List<User> getUsers() {
        // Simulate a list of users
        return Arrays.asList(
                new User("1", "ram", "ram@example.com"),
                new User("2", "shyam", "shyam@example.com"),
                new User("3", "varun", "varun@example.com"),
                new User("4", "aadhya", "aadhya@example.com")
        );
    }
}