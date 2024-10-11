package com.notifications.Services;

import com.notifications.Interfaces.NotificationChannel;
import com.notifications.Senders.EmailNotificationChannel;
import com.notifications.Senders.SMSNotificationChannel;

public class NotificationChannelFactory {
    public static NotificationChannel createChannel(String channelType) {
        switch (channelType) {
            case "Email":
                return new EmailNotificationChannel();
            case "SMS":
                return new SMSNotificationChannel();
            default:
                throw new IllegalArgumentException("Unsupported channel type");
        }
    }
}

