package com.example.tema.controller;

import com.example.tema.model.Order;
import com.example.tema.service.PaymentServiceProd;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Profile("prod")
@RequestMapping("payment")
public class PaymentControllerProd {
    private final PaymentServiceProd paymentServiceProd;

    @PostMapping("create")
    public Order makeOrder(@RequestBody Order order) {
        return paymentServiceProd.makeOrder(order);
    }
}
