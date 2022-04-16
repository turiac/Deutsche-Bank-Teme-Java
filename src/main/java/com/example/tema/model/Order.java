package com.example.tema.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;
}
