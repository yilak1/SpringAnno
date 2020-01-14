package com.lds;

import com.lds.enjoy1.cap7.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfig.class);
        TestService service = app.getBean(TestService.class);
        service.println();
        //TestDao dao = app.getBean(TestDao.class);
        //System.out.println(dao);
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfig2.class);
        Sun sun  = app.getBean(Sun.class);
        System.out.println(sun);

        Moon moon = app.getBean(Moon.class);
        System.out.println(moon);
    }
}
