package com.lds;

import com.lds.enjoy1.cap2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Cap2Test {
    @Test
    public void test01(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name: names){
            System.out.println(name);
        }
    }

    /**
     * 测试@Lazy
     */
    @Test
    public void test02(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        app.getBean("persion");
    }

    /**
     * 测试@Scope多实例模式
     */
    @Test
    public void test03(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
        Object persion1 = app.getBean("persion");
        Object persion2 = app.getBean("persion");
        System.out.println(persion1 == persion2);
    }
}
