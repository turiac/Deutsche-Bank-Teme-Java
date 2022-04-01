package com.javaacademy.sprinttestapp.repositories;

import com.javaacademy.sprinttestapp.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    public Order getById(Integer orderId);
}
