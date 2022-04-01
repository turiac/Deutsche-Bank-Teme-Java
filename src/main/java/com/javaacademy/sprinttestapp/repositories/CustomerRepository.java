package com.javaacademy.sprinttestapp.repositories;

import com.javaacademy.sprinttestapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer getById(Integer id);
}
