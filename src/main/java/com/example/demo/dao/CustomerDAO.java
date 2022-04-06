package com.example.demo.dao;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CustomerDAO implements DAO<CustomerDAO> {
    private final CustomerRepository customerRepository;

    public Optional<CustomerDAO> get(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Optional<CustomerDAO> get() {
        return Optional.empty();
    }

    @Override
    public void create(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(CustomerDAO customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void update(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    public List<Customer> findByFilter(String username, String city, String country) {
        return customerRepository.findByFilter(username, city, country);
    }
}
