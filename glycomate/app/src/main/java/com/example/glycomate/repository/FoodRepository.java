package com.example.glycomate.repository;

import com.example.glycomate.model.FoodModel;
import java.util.ArrayList;
import java.util.List;

public class FoodRepository {
    private final List<FoodModel> foodLog = new ArrayList<>();

    public void addFood(FoodModel food) {
        foodLog.add(food);
    }

    public List<FoodModel> getFoodLog() {
        return foodLog;
    }
}
