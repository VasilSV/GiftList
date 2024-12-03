package com.example.giftlist.web;

import com.example.giftlist.model.entity.UserEntity;
import com.example.giftlist.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/auth/")
@RestController
public class UserRegistrationController {

    private final UserService userService;


    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/register")
//    public String register(){
//        return "auth-register";
//    }
    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser
    (@RequestBody UserEntity userEntity){

UserEntity registeredUserNow = userService.registerUser(userEntity);
return ResponseEntity.ok(registeredUserNow);


    }

}
