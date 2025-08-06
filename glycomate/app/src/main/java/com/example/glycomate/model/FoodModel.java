package com.example.glycomate.model;

import java.util.Map;

public class FoodModel {
    private String foodName;
    private Map<String, Float> nutrients;

    public FoodModel(String foodName, Map<String, Float> nutrients) {
        this.foodName = foodName;
        this.nutrients = nutrients;
    }

    public String getFoodName() {
        return foodName;
    }

    public Map<String, Float> getNutrients() {
        return nutrients;
    }
}
