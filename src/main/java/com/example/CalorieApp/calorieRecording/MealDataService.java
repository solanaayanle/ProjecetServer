package com.example.CalorieApp.calorieRecording;

public interface MealDataService {
    Meal getMealById(Long mealId);

    Meal createMeal(Meal meal);

    Meal saveMeal(Meal meal);

    Meal findMealById(Long id);

    Meal updateMeal(Long mealId, Meal meal);

    void deleteMeal(Long mealId);

}
