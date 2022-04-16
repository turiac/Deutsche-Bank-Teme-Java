package com.example.tema.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("/")
    public String makePayment(@RequestBody Long customerId, @RequestBody Long orderId, @RequestBody Double totalSum) {
        return "Customer with id: " + customerId + "payed: " + totalSum + "for order: " + orderId;
    }
}
