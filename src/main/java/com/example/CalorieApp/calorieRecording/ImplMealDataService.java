package com.example.CalorieApp.calorieRecording;

import org.springframework.stereotype.Service;

@Service
public class ImplMealDataService implements MealDataService {
    // final - initialized exactly once
    private final MealRepository mealRepository;

    public ImplMealDataService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public Meal getMealById(Long mealId) {
        // Fetches meal by ID. Returns null if meal is not found.
        return mealRepository.findById(mealId).orElse(null);
    }

    @Override
    public Meal createMeal(Meal meal) {
        // Saves a new meal to the database.
        // Add checks if required before saving.
        return mealRepository.save(meal);
    }

    @Override
    public Meal saveMeal(Meal meal) {
        // Saves changes to an existing meal.
        return mealRepository.save(meal);
    }

    @Override
    public Meal findMealById(Long id) {
        // Another method to fetch meal by ID.
        return mealRepository.findById(id).orElse(null);
    }

    @Override
    public Meal updateMeal(Long mealId, Meal meal) {
        // Update meal details. Check if meal exists before updating.
        return mealRepository.findById(mealId).orElse(null);
        // .map(existingMeal -> {
        // Update the necessary fields of existingMeal with values from meal.
        // For example:
        // existingMeal.setName(meal.getName());
        // existingMeal.setEmail(meal.getEmail());
        // Add more fields to update as needed.
        // return mealRepository.save(existingMeal);
        // }).orElseGet(() -> {
        // Handle the case where the meal doesn't exist.
        // This might be creating a new meal or throwing an exception.
        // return Meal;
        // });

    }

    @Override
    public void deleteMeal(Long mealId) {
        // Deletes the meal with the given ID.
        mealRepository.deleteById(mealId);
    }

}
