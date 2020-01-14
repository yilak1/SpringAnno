package com.lds.enjoy1.cap1;

import com.lds.enjoy1.cap1.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest2 {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(app.getBean("persion"));
    }
}
