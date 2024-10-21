package com.example.facebook_be.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    private String rePassword;
    private LocalDate birthDay;
    private int friend;
    private String image;

    private LocalDateTime createdAt = LocalDateTime.now();
}
