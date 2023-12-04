package com.example.CalorieApp.userData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indicates that this class serves as a RESTful controller
@RequestMapping("/users")
public class UserController {
    private final UserDataService userService;

    // Follwos the inversion of control principle (IOC Principle)
    public UserController(UserDataService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user); // Returns a 200 OK with the user in the body
        } else {
            return ResponseEntity.notFound().build(); // Returns a 404 Not Found without a body
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User updatedUser = userService.updateUser(id, userDetails);
        User user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(updatedUser); // Returns a 200 OK with the user in the body
        } else {
            return ResponseEntity.notFound().build(); // Returns a 404 Not Found without a body
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
