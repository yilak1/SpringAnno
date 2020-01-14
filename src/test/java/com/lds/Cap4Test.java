package com.lds;

import com.lds.enjoy1.cap4.config.Cap4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap4Test {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        Object beanFactoryBean = app.getBean("beanFactoryBean");
        System.out.println(beanFactoryBean.getClass().getName());
        for (String name: names){
            System.out.println(name);
        }
    }
}
