package com.example.CalorieApp.userData;

public interface UserDataService {
    // Methods and signatures are defines without a body (also without access
    // modifiers because it is not being implemented)
    User getUserById(Long userId);

    User createUser(User user);

    User saveUser(User user);

    User findUserById(Long id);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);

    boolean authenticateUser(String username, String password);

    String retrieveEmail(String username);

    boolean isEmailAvailable(String email);
}
