package com.example.demo.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@EnableAutoConfiguration
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private int price;
}
