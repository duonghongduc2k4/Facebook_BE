package com.example.facebook_be.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accAddFriend;

    @ManyToOne
    @JoinColumn(name = "id_account")
    @JsonIgnore
    private Account account;

}
