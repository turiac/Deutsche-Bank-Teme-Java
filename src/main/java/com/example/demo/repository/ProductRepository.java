package com.example.demo.repository;

import com.example.demo.dao.ProductDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDAO,Integer> {
}
