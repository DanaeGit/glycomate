package com.example.glycomate.repository;

import com.example.glycomate.model.ActivityModel;

public class ActivityRepository {
    private ActivityModel latestActivity;

    public void updateActivity(ActivityModel activity) {
        this.latestActivity = activity;
    }

    public ActivityModel getLatestActivity() {
        return latestActivity;
    }
}
