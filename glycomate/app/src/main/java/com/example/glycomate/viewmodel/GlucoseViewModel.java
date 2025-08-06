package com.example.glycomate.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GlucoseViewModel extends ViewModel {
    private final MutableLiveData<Float> currentGlucose = new MutableLiveData<>();

    public void updateGlucose(float value) {
        currentGlucose.setValue(value);
    }

    public LiveData<Float> getCurrentGlucose() {
        return currentGlucose;
    }
}
