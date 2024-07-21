package com.example.giftlist.model.entity;


import com.example.giftlist.model.enums.UserTypeEntity;
import jakarta.persistence.*;

import javax.validation.constraints.Email;

@Entity
@Table(name = "users")

public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserTypeEntity userTypeEntity;



}
