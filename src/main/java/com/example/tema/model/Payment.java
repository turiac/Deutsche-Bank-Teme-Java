package com.example.tema.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String paymentMethod;

    @OneToOne
    Order order;

}
