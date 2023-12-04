package com.example.CalorieApp.calorieRecording;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indicates that this class serves as a RESTful controller
@RequestMapping("/meals")
public class MealController {
    private final MealDataService userService;

    // Follwos the inversion of control principle (IOC Principle)
    public MealController(MealDataService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Meal> createMeal(@RequestBody Meal user) {
        Meal savedMeal = userService.createMeal(user);
        return new ResponseEntity<>(savedMeal, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meal> getMealById(@PathVariable Long id) {
        Meal user = userService.getMealById(id);
        if (user != null) {
            return ResponseEntity.ok(user); // Returns a 200 OK with the user in the body
        } else {
            return ResponseEntity.notFound().build(); // Returns a 404 Not Found without a body
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Meal> updateMeal(@PathVariable Long id, @RequestBody Meal userDetails) {
        Meal updatedMeal = userService.updateMeal(id, userDetails);
        Meal user = userService.getMealById(id);
        if (user != null) {
            return ResponseEntity.ok(updatedMeal); // Returns a 200 OK with the user in the body
        } else {
            return ResponseEntity.notFound().build(); // Returns a 404 Not Found without a body
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeal(@PathVariable Long id) {
        userService.deleteMeal(id);
        return ResponseEntity.noContent().build();
    }
}
