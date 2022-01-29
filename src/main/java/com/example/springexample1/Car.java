package com.example.springexample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("v8Engine")
    private Engine engine;

    public void drive() {
        engine.running();
    }
}
