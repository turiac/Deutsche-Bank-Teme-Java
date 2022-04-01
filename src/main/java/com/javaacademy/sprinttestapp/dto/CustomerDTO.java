package com.javaacademy.sprinttestapp.dto;

import com.javaacademy.sprinttestapp.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDTO {
    private String name;
    private List<Order> orders;
}
