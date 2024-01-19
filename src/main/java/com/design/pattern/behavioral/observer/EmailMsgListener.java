package com.design.pattern.behavioral.observer;


public record EmailMsgListener(String email) implements IListener {

    @Override
    public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }

}

