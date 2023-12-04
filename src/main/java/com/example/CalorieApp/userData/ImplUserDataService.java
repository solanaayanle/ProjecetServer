package com.example.CalorieApp.userData;

import org.springframework.stereotype.Service;

@Service
public class ImplUserDataService implements UserDataService {
    // final - initialized exactly once
    private final UserRepository userRepository;

    public ImplUserDataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long userId) {
        // Fetches user by ID. Returns null if user is not found.
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User createUser(User user) {
        // Saves a new user to the database.
        // Add checks if required before saving.
        return userRepository.save(user);
    }

    @Override
    public User saveUser(User user) {
        // Saves changes to an existing user.
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        // Another method to fetch user by ID.
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Long userId, User user) {
        // Update user details. Check if user exists before updating.
        return userRepository.findById(userId).orElse(null);
        // .map(existingUser -> {
        // Update the necessary fields of existingUser with values from user.
        // For example:
        // existingUser.setName(user.getName());
        // existingUser.setEmail(user.getEmail());
        // Add more fields to update as needed.
        // return userRepository.save(existingUser);
        // }).orElseGet(() -> {
        // Handle the case where the user doesn't exist.
        // This might be creating a new user or throwing an exception.
        // return User;
        // });

    }

    @Override
    public void deleteUser(Long userId) {
        // Deletes the user with the given ID.
        userRepository.deleteById(userId);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        // Implement your authentication logic here.
        // This is a placeholder implementation.
        return false;
    }

    @Override
    public String retrieveEmail(String username) {
        // Retrieve email based on username. This is a placeholder.
        return null;
    }

    @Override
    public boolean isEmailAvailable(String email) {
        // Check if the email is already in use.
        return this.retrieveEmail(email) != null;
        //findByEmail(email).isEmpty();
    }

}
