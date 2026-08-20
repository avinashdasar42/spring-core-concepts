package com.example.spring_core_concepts.DI.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

//    Field Injection: it uses reflection internally to resolve dependency like
//    Field field = OrderService.class.getDeclaredField("paymentService");
//    field.setAccessible(true);
//    field.set(orderServiceObj, paymentServiceObj);

//    Issues with Field injection:
//    this breaks encapsulation(accessing private field directly using reflection),
//    immutability(field can be re-assigned later),
//    hard to test(uses reflection),
//    Poor readability > from code it is become difficult to say OrderService needs PaymentService as dependency
    @Autowired
    private PaymentService paymentService;

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order is placed");
    }
}
