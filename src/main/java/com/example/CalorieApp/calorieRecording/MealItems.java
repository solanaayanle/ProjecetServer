package com.example.CalorieApp.calorieRecording;
import java.util.ArrayList;
import java.util.List;

public class MealItems {
    private String mealName;
    private List<CalorieTrackingNode> foodItems;

    public MealItems(String mealName) {
        this.mealName = mealName;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItems(CalorieTrackingNode foodItem) {
        this.foodItems.add(foodItem);
    }

    public String getMealName() {
        return mealName;
    }

    public float getMealCalories() {
        float totalCalories = 0.0f;
        for (CalorieTrackingNode itemCalories : this.foodItems) {
            totalCalories = totalCalories + itemCalories.getCalories();
        }
        return totalCalories;
    }


    public void removeMealItem(CalorieTrackingNode foodItem) {  
         this.foodItems.remove(this.foodItems.indexOf(foodItem));
    }
}
