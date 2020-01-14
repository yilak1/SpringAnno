package com.lds;

import com.lds.enjoy1.cap3.config.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        annotationConfigApplicationContext.getBean("persion");
    }
}
