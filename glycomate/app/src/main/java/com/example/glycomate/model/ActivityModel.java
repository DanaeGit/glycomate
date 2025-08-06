package com.example.glycomate.model;

public class ActivityModel {
    private int steps;
    private float calories;

    public ActivityModel(int steps, float calories) {
        this.steps = steps;
        this.calories = calories;
    }

    public int getSteps() {
        return steps;
    }

    public float getCalories() {
        return calories;
    }
}
