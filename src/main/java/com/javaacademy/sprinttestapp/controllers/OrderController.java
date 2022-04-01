package com.javaacademy.sprinttestapp.controllers;

import com.javaacademy.sprinttestapp.model.Order;
import com.javaacademy.sprinttestapp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Integer orderId) {
        return orderService.getById(orderId);
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        orderService.insert(order);
        return order;
    }

    @PostMapping("/orders/update")
    public Order updateOrder(@RequestBody Order order) {
        orderService.update(order);
        return order;
    }

    /**
    @GetMapping("/orders")
    public Order orderFilter(@RequestBody Order order) {
        StringBuilder stringBuilder = new StringBuilder();
        for (order.getOrderId() == Integer.parseInt())
    }
    **/
}
