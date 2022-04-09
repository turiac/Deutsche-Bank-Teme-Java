package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByUsernameAndCityAndCountry(String username, String city, String country);

    @Query("SELECT u FROM Customer u WHERE u.username = ?1")
    public Customer findByUsername(String username);
}
