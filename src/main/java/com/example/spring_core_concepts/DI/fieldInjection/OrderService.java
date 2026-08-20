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
//    1. this breaks encapsulation(accessing private field directly using reflection),
//    2. immutability(field can be re-assigned later),
//    3. hard to test(uses reflection),
//    4. Poor readability > from code it is become difficult to say OrderService needs PaymentService as dependency
//    5. chances of NPE: with field DI, spring create bean first and resolve dependency later i.e At construction time, dependency is null only
//    what if we call method before spring finishes injection >> we get NPE

    @Autowired
    private PaymentService paymentService;

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order is placed");
    }
}
