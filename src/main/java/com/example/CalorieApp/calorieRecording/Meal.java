package com.example.CalorieApp.calorieRecording;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Meal {
    @Id
    private Long id;

    private String name;
    private int calories;
    private Date dateConsumed;

    // Constructors
    public Meal() {
    }

    public Meal(String name, int calories, Date dateConsumed) {
        this.name = name;
        this.calories = calories;
        this.dateConsumed = dateConsumed;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Date getDateConsumed() {
        return dateConsumed;
    }

    public void setDateConsumed(Date dateConsumed) {
        this.dateConsumed = dateConsumed;
    }

}