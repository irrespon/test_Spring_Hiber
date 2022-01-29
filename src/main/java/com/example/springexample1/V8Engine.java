package com.example.springexample1;

import org.springframework.stereotype.Component;

@Component
public class V8Engine implements Engine{
    @Override
    public void running() {
        System.out.println("WroomV8");
    }
}
