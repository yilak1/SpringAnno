package com.lds.enjoy1.cap7;

import org.springframework.stereotype.Component;

@Component
public class Moon {
    public Moon() {
        System.out.println("moon constructor...");
    }

    public void init(){
        System.out.println("moon init...");
    }

    public void destroy(){
        System.out.println("moon destroy....");
    }

}

