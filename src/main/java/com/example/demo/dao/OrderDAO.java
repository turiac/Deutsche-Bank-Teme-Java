package com.example.demo.dao;

import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class OrderDAO implements DAO<OrderDAO> {
    private final OrderRepository orderRepository;

    public Optional<OrderDAO> get(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public Optional<OrderDAO> get() {
        return Optional.empty();
    }

    @Override
    public void create(OrderDAO order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(OrderDAO order) {
        orderRepository.delete(order);
    }

    @Override
    public void update(OrderDAO order) {
        orderRepository.save(order);
    }
}
