package com.example.spring_core_concepts.DI.fieldInjection;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void pay() {
        System.out.println("Payment DONE");
    }
}
