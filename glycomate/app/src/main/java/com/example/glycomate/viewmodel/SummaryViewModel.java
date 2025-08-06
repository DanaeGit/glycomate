package com.example.glycomate.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SummaryViewModel extends ViewModel {
    private final MutableLiveData<String> summary = new MutableLiveData<>();

    public void generateSummary() {
        summary.setValue("Daily summary: Glucose stable, good activity.");
    }

    public LiveData<String> getSummary() {
        return summary;
    }
}
