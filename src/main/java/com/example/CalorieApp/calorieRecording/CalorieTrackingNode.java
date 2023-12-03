package com.example.CalorieApp.calorieRecording;
public class CalorieTrackingNode {
 
    private String foodItem;
    private float calories;
    private String dateRecorded; 

    public CalorieTrackingNode(String foodItem, float calories, String dateRecorded) {
        this.foodItem = foodItem;
        this.calories = calories;
        this.dateRecorded = dateRecorded;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public float getCalories() {
        return calories;
    }

    public String getDateRecorded() {
        return dateRecorded;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public void setDateRecorded(String dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    @Override
    public String toString() {
        return "Food: " + foodItem + ", Calories: " + calories + ", Date: " + dateRecorded;
    }
    

}
