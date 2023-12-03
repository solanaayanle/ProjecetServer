package com.example.CalorieApp.calorieRecording;
import java.util.HashMap;
import java.util.Map;

public class CaloriesOfTheDay {
    // adheres to the Single Responsibility Principle
    private String dateRecorded;
    private Map<String, MealItems> mealsRecorded;

    public CaloriesOfTheDay(String dateRecorded) {
        this.dateRecorded = dateRecorded;
        this.dateRecorded = dateRecorded;
        this.mealsRecorded = new HashMap<>();

        this.mealsRecorded.put("breakfast", new MealItems("breakfast"));
        this.mealsRecorded.put("lunch", new MealItems("lunch"));
        this.mealsRecorded.put("dinner", new MealItems("dinner"));
        this.mealsRecorded.put("snacks", new MealItems("snacks"));
    }

    public String getDateRecorded() {
        return this.dateRecorded;
    }

    public float getTotalCaloriesOfTheDay() {
        float totalCaloriesOfTheDay = 0.0f;
        for (MealItems itemCalories : this.mealsRecorded.values()) {
            totalCaloriesOfTheDay = totalCaloriesOfTheDay + itemCalories.getMealCalories();
        }
        return totalCaloriesOfTheDay;
    }

    public Map<String, MealItems> getMealsOfTheDay() {
        return this.mealsRecorded;
    }

    public MealItems getSpecificMealOfTheDay(String mealItemName) {
        for (MealItems meal : this.mealsRecorded.values()) {
            if (meal.getMealName().equals(mealItemName)) {
                return meal;
            }
        }
        return null;
    }

    public boolean isMealEmpty(String mealItemName) {
        MealItems meal = this.getSpecificMealOfTheDay(mealItemName);

        return meal != null;
    }
}
