package com.notifications.Models;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private Set<String> subscriptions;

    public User(String name) {
        this.name = name;
        this.subscriptions = new HashSet<>();
    }

    public void subscribe(String channelType) {
        subscriptions.add(channelType);
    }

    public boolean isSubscribed(String channelType) {
        return subscriptions.contains(channelType);
    }
}
