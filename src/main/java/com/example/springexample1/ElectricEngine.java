package com.example.springexample1;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine{
    @Override
    public void running() {
        System.out.println("WroomV6");
    }
}
