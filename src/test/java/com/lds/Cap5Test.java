package com.lds;

import com.lds.enjoy1.cap5.config.ConfigLifeCycle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap5Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ConfigLifeCycle.class);
        System.out.println("IOC 容器创建完成");
        app.getBean("bike");
        app.close();
    }
}
