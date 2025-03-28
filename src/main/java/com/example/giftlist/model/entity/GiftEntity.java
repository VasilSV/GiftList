package com.example.giftlist.model.entity;

import com.example.giftlist.model.enums.GiftTypeEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "gifts")
public class GiftEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String gift;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GiftTypeEntity giftTypeEntity;

    public GiftEntity() {
    }

    public Long getId() {
        return id;
    }
}
