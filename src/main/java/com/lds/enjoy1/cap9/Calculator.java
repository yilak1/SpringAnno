package com.lds.enjoy1.cap9;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int div(int x, int y){
        System.out.println("-----");
        return x / y;
    }
}
