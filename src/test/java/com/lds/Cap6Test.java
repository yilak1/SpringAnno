package com.lds;

import com.lds.enjoy1.cap6.Bird;
import com.lds.enjoy1.cap6.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap6Test {
    @Test
    public void test0(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name); //打印出所有bean的名字
        }
        //取出Bird对象
        Bird bird = (Bird)app.getBean("bird");
        System.out.println(bird);
        System.out.println("IOC complete");
        ConfigurableEnvironment environment = app.getEnvironment();
        System.out.println("environment: "+environment.getProperty("bird.color"));
        app.close();
    }
}
