package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String city;
    private String country;

    @Column(nullable = false, length = 35)
    private String username;

    @Column(nullable = false, length = 64)
    private String password;
}
