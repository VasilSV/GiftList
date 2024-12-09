package com.example.giftlist.model.events;

import org.springframework.context.ApplicationEvent;

public class UserRegisterEvent extends ApplicationEvent {
    private final String userEmail;

    public UserRegisterEvent(Object source, String userEmail) {
        super(source);
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
