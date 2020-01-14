package com.lds.enjoy1.cap5.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Jeep {

    public Jeep(){
        System.out.println("Jeep constructor........");
    }

    @PostConstruct
    public void init(){
        System.out.println("jeep init........");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jeep destroy..........");
    }
}
