package com.example.demo.repository;

import com.example.demo.dao.OrderDAO;
import com.example.demo.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <OrderDAO, Integer> {
}
