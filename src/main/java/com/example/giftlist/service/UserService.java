package com.example.giftlist.service;

import com.example.giftlist.dtos.UserDTO;
import com.example.giftlist.dtos.UserRegistrationDTO;
import com.example.giftlist.model.entity.UserEntity;
import com.example.giftlist.model.events.UserRegisterEvent;
import com.example.giftlist.repository.UserRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, ApplicationEventPublisher applicationEventPublisher, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.applicationEventPublisher = applicationEventPublisher;
        this.passwordEncoder = passwordEncoder;
    }

//    public List<UserDTO> getAllUsers() {

       // return userRepository.findAll().stream()
               // .map(UserService::mapUserDTO).collect(Collectors.toList());
   // }


    public UserEntity registerUser(UserEntity userRegistrationDTO) {

        UserEntity userEntity = new UserEntity()
                .setFirstName(userRegistrationDTO.getFirstName())
                        .setLastName(userRegistrationDTO.getLastName())
                                .setEmail(userRegistrationDTO.getEmail())
                                        .setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));



        applicationEventPublisher.publishEvent
                (new UserRegisterEvent("UserService", userRegistrationDTO.getEmail()));
        System.out.println("User");

       return   userRepository.save(userEntity);

    }


    private  UserEntity mapUserDTO(UserRegistrationDTO userRegistrationDTO) {
        return new UserEntity()
                .setFirstName(userRegistrationDTO.getFirstName())
                .setLastName(userRegistrationDTO.getLastName())
                .setEmail(userRegistrationDTO.getEmail())
                .setPassword(userRegistrationDTO.getPassword())

                //todo
        ;
    }
}
