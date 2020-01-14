package com.lds.enjoy1.cap5.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {

    public void Train(){
        System.out.println("train construct..................");
    }
    public void destroy() throws Exception {
        System.out.println("train destroy..................");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("train afterPropertiesSet...........");
    }
}
