package com.example.demo.controller;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Data
public class CustomerController {

    private final CustomerDAO customerDAO;

    @GetMapping()
    Optional<Customer> getAllCustomers(int id) {
        return customerDAO.get();
    }

    @PostMapping()
    void createCustomer(@RequestBody Customer customer) {
        customerDAO.create(customer);
    }

    @GetMapping("/viewAll")
    public ModelAndView ViewAllCustomers() {
        Optional<Customer> customer = customerDAO.get();
        ModelAndView modelAndView = new ModelAndView("customerView");
        modelAndView.addObject("customers",customer);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewCustomer(@PathVariable Integer id) {
        Optional<Customer> customer = this.customerDAO.get();
        ModelAndView modelAndView = new ModelAndView("customerView");
        modelAndView.addObject("customers",customer);
        return modelAndView;
    }

    @GetMapping("/filter")
    public ModelAndView filterCustomers(@RequestParam("username") String username, @RequestParam("city") String city, @RequestParam("country") String country) {
        List<Customer> customers = customerDAO.findByFilter(username, city, country);
        ModelAndView modelAndView = new ModelAndView("customerView");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
