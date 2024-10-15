package com.example.facebook_be.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int total;
    private String content;

    @ManyToOne
    @JoinColumn(name = "id_account")
    @JsonIgnore
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_status")
    @JsonIgnore
    private Status status;
}
