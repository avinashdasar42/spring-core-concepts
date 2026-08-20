package com.example.spring_core_concepts.DI.setterInjection;

import org.springframework.stereotype.Service;

@Service
public class PaymentService2 {
    public void pay() {
        System.out.println("Payment DONE");
    }
}
