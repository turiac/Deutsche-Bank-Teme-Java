package com.example.tema.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String name;

    @OneToMany
    List<Order> orderList;
}
