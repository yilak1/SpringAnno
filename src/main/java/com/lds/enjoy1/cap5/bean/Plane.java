package com.lds.enjoy1.cap5.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane(){
        System.out.println("plane constructor ..............s");
    }
    @PostConstruct
    public void init(){
        System.out.println("plane init.............");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("plane destroy ...............");
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
