package com.lds.enjoy1.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(app.getBean("persion"));
    }
}
