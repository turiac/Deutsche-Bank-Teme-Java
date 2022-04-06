package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String city;
    private String country;
}
