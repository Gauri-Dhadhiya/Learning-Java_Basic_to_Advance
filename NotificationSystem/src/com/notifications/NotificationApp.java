package com.notifications;

import java.util.List;

import com.notifications.Models.User;
import com.notifications.Services.MockDatabase;
import com.notifications.Services.NotificationManager;

public class NotificationApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java NotificationApp <Channel> <Subject> <MessageBody>");
            return;
        }

        String channelType = args[0];
        String subject = args[1];
        String messageBody = args[2];

        NotificationManager notificationManager = NotificationManager.getInstance();
        List<User> users = MockDatabase.getUsers();

        notificationManager.sendNotifications(channelType, subject, messageBody, users);
    }
}
