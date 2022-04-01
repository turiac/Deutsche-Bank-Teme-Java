package com.javaacademy.sprinttestapp.services;

import com.javaacademy.sprinttestapp.model.Order;
import com.javaacademy.sprinttestapp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order getById(Integer orderId) {
        return orderRepository.getById(orderId);
    }

    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }

    public void insert(Order order) {
        orderRepository.save(order);
    }

    public void update(Order order) {
        orderRepository.save(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }

}
