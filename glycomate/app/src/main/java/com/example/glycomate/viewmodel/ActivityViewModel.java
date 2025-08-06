package com.example.glycomate.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ActivityViewModel extends ViewModel {
    private final MutableLiveData<Integer> steps = new MutableLiveData<>();

    public void syncSteps() {
        // Placeholder: integrate Google Fit/Apple HealthKit
    }

    public LiveData<Integer> getSteps() {
        return steps;
    }
}
