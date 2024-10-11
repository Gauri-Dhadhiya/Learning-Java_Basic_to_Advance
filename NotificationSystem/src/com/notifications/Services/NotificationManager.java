package com.notifications.Services;

import java.util.List;

import com.notifications.Interfaces.NotificationChannel;
import com.notifications.Models.User;

public class NotificationManager {
    private static NotificationManager instance;

    private NotificationManager() {}

    public static synchronized NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void sendNotifications(String channelType, String subject, String messageBody, List<User> users) {
        NotificationChannel channel = NotificationChannelFactory.createChannel(channelType);
        for (User user : users) {
            if (user.isSubscribed(channelType)) {
                channel.sendNotification(subject, messageBody);
            }
        }
    }
}
