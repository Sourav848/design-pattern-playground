package com.design.pattern.behavioral.observer;

public record MobileAppListener(String username) implements IListener {

    @Override
    public void update(Event eventType) {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }

}