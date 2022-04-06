package com.example.demo.dao;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CustomerDAO implements DAO<Customer> {
    private final CustomerRepository customerRepository;

    public Optional<Customer> get(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Optional<Customer> get() {
        return Optional.empty();
    }

    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> findByFilter(String username, String city, String country) {
        return customerRepository.findByUsernameAndCityAndCountry(username, city, country);
    }
}
