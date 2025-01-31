package com.example.giftlist.web;

import com.example.giftlist.dtos.UserDTO;
import com.example.giftlist.repository.UserRepository;
import com.example.giftlist.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserRepository userRepository;

private UserService userService;
    public UserRestController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }


//    @GetMapping("/users")
//    public ResponseEntity<List<UserDTO>> getAllUsers()
//    {
//        return ResponseEntity.ok(userService.getAllUsers());
//
//    }

}
