package com.example.glycomate.model;

public class GlucoseModel {
    private float glucoseValue;
    private long timestamp;

    public GlucoseModel(float glucoseValue, long timestamp) {
        this.glucoseValue = glucoseValue;
        this.timestamp = timestamp;
    }

    public float getGlucoseValue() {
        return glucoseValue;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
