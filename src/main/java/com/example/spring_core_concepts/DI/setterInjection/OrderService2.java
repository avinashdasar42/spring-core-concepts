package com.example.spring_core_concepts.DI.setterInjection;

import com.example.spring_core_concepts.DI.constructorInjection.PaymentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService2 {

//    Setter Injection: use for optional dependencies
//    Benefits:
//    1. Immutability issue exists
//    2. chance of NPE: Since bean is partially initialized chances of NPE
//    3.

    private PaymentService2 paymentService2;

    public void placeOrder(){
        paymentService2.pay();
        System.out.println("Order is placed");
    }

    @Autowired
    public void setPaymentService2(PaymentService2 paymentService2){
        this.paymentService2 = paymentService2;
    }
}
