package com.notifications.Senders;

import com.notifications.Interfaces.NotificationChannel;

public class EmailNotificationChannel implements NotificationChannel {
	@Override
    public void sendNotification(String subject, String messageBody) {
        System.out.println("Email sent with Subject: " + subject + " and Body: " + messageBody);
    }
}


