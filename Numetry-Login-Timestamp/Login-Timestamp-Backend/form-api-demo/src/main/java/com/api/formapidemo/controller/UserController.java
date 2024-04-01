package com.api.formapidemo.controller;

import com.api.formapidemo.model.User;
import com.api.formapidemo.repository.UserRepository;
import com.api.formapidemo.response.LastLogoutResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        User existingUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        if (existingUser != null) {
            existingUser.setLastLogin(LocalDateTime.now());
            userRepository.save(existingUser);
            return ResponseEntity.ok(existingUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/lastlogin/{username}")
    public ResponseEntity<LocalDateTime> getLastLoginByUsername(@PathVariable String username) {
        User user = userRepository.findByUserName(username);
        if (user != null) {
            LocalDateTime lastLogin = user.getLastLogin();
            return ResponseEntity.ok().body(lastLogin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{username}/logout")
    public ResponseEntity<Void> updateLastLogout(@PathVariable String username) {
        User user = userRepository.findByUserName(username);
        if (user != null) {
            user.setLastLogout(LocalDateTime.now());
            userRepository.save(user);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/lastlogout/{username}")
    public ResponseEntity<LastLogoutResponse> getLastLogoutTimestamp(@PathVariable String username) {
        // Retrieve the last logout timestamp from the database based on the username
        LocalDateTime lastLogoutTimestamp = userRepository.findLastLogoutByUserName(username);
        if (lastLogoutTimestamp != null) {
            return ResponseEntity.ok().body(new LastLogoutResponse(lastLogoutTimestamp));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsersDetails() {
        List<User> users = userRepository.findAll();
        if (!users.isEmpty()) {
            return ResponseEntity.ok(users);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
