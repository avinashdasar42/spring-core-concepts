package com.example.spring_core_concepts.DI.constructorInjection;

import org.springframework.stereotype.Service;

@Service
public class PaymentService1 {
    public void pay() {
        System.out.println("Payment DONE");
    }
}
