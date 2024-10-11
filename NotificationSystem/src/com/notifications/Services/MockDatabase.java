package com.notifications.Services;

import java.util.Arrays;
import java.util.List;

import com.notifications.Models.User;

public class MockDatabase {
    public static List<User> getUsers() {
        User user1 = new User("Pratham");
        user1.subscribe("Email");

        User user2 = new User("Gauri");
        user2.subscribe("SMS");

        return Arrays.asList(user1, user2);
    }
}
