package com.example.giftlist.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
}
