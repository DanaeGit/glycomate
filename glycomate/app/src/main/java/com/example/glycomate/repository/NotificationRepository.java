package com.example.glycomate.repository;

import com.example.glycomate.model.NotificationModel;
import java.util.ArrayList;
import java.util.List;

public class NotificationRepository {
    private final List<NotificationModel> notifications = new ArrayList<>();

    public void addNotification(NotificationModel notification) {
        notifications.add(notification);
    }

    public List<NotificationModel> getAllNotifications() {
        return notifications;
    }
}
