package com.example.giftlist.service;

import com.example.giftlist.dtos.UserRegistrationDTO;
import com.example.giftlist.model.events.UserRegisterEvent;
import com.example.giftlist.repository.UserRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserActivationService {

    private final UserRepository userRepository;
    private final UserService userService;

    private final ApplicationEventPublisher applicationEventPublisher;


    public UserActivationService(UserRepository userRepository,
                                 UserService userService,
                                 ApplicationEventPublisher applicationEventPublisher) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @EventListener(UserRegisterEvent.class)
    public void userRegistered(UserRegisterEvent event) {

        System.out.println("User" + event.getUserEmail());


    }


}
