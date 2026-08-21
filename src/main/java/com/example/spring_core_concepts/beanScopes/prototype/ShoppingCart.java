package com.example.spring_core_concepts.beanScopes.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public void addItems(String item){
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}
