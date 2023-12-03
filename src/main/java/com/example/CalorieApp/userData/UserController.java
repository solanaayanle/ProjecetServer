package com.example.CalorieApp.userData;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserDataService userService;

    public UserController(UserDataService userService) {
        this.userService = userService;
    }

}
