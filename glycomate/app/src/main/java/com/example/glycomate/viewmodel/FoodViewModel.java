package com.example.glycomate.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Map;

public class FoodViewModel extends ViewModel {
    private final MutableLiveData<Map<String, Float>> nutritionFacts = new MutableLiveData<>();

    public void analyzeFood(String foodInput) {
        // Placeholder for food analysis logic
    }

    public LiveData<Map<String, Float>> getNutritionFacts() {
        return nutritionFacts;
    }
}
