package com.example.tema.service;


import com.example.tema.model.Order;
import com.example.tema.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentServiceDev {
    private final PaymentRepository paymentRepository;

    public Order makeOrder(Order order) {
        System.out.println("Made an order in dev service");
        paymentRepository.save(order);
        return order;
    }
}
