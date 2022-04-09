package com.example.demo.repository;

import com.example.demo.dao.OrderDAO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDAO, Integer> {
}
