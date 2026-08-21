package com.example.spring_core_concepts.beanScopes.prototype;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
//import javax.inject.Provider;


@Service
public class OrderService3 {

//    private final ShoppingCart cart; //prototype injection into singleton, same cart used by all users
//    private final ShoppingCart cart;
//
//    public OrderService3(ShoppingCart cart) {
//        this.cart = cart;
//    }

    @Lookup
    public ShoppingCart getCart() { //Spring will override it and each user has its own cart
        return null;
    }

    public void placeOrder(String item){
        ShoppingCart cartList = getCart();
        cartList.addItems(item);
        System.out.println("Shopping cart items: "+cartList+" : "+cartList.getItems());
    }
}
