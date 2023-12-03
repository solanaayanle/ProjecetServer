package com.example.CalorieApp.userData;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private String dob;
    private String username;
    private String hashedPassword;
    private String gender;
    private float height;
    private float weight;
    private float calorieGoal;
    private String unit;

    public User(Long id,
            String firstName,
            String lastName,
            int age,
            String dob,
            String username,
            String hashedPassword,
            String gender,
            float height,
            float weight,
            float calorieGoal,
            String unit) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.dob = dob;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.calorieGoal = calorieGoal;
        this.unit = unit;
    };

    public Long getUserId() {
        return this.id;
    }

    public void setUserId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCalorieGoal() {
        return this.calorieGoal;
    }

    public void setCalorieGoal(float calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

};