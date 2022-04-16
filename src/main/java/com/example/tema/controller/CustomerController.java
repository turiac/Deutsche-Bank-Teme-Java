package com.example.tema.controller;

import com.example.tema.model.Customer;
import com.example.tema.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getById(@PathVariable Long id) {
        return customerService.getById(id);
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        customerService.insert(customer);
        return customer;
    }
    @PostMapping("/customers/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.update(customer);
        return customer;
    }

    @DeleteMapping("/customers/deleted/{id}")
    public void deleteCustomer(@RequestBody Customer customer) {
        customerService.delete(customer);
    }
}

