package com.example.spring_core_concepts.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    @Autowired
    private A a;

    public void methodB(){
        System.out.println("In B class");
    }
}
