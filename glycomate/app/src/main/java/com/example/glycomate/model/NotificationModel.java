package com.example.glycomate.model;

public class NotificationModel {
    private String message;
    private long timestamp;

    public NotificationModel(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
