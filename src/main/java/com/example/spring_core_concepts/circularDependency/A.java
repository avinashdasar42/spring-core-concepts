package com.example.spring_core_concepts.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class A {

    @Lazy
    @Autowired
    private B b;

    public void methodA(){
        System.out.println("In A class");
    }
}
