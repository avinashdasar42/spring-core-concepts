package com.example.spring_core_concepts.DI.constructorInjection;

import org.springframework.stereotype.Service;

@Service
public class OrderService1 {

//    Constructor Injection: Best DI > must be used in Production code
//    Benefits:
//    1. Immutability: once assign in the constructor can't be re-assigned (due to final keyword)
//    2. Object gets created fully including dependency injection >> creates objects of all dependency first if not created
//    3. Easy to test: just pass mock objects in the constructor
//    4. Readable: we can see what all classes OrderService depends on (inside constructor)
//    if constructor size grows >> means need to restructure class itself >>bad class design
//    5. No chance of NPE: beans get fully initialized in the constructor only (including wiring) and since dependency is final it can't be re-assigned.

    private final PaymentService1 paymentService1;

    public OrderService1(PaymentService1 paymentService1) {
        this.paymentService1 = paymentService1;
    }

    public void placeOrder(){
        paymentService1.pay();
        System.out.println("Order is placed");
    }
}
