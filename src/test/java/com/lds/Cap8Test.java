package com.lds;

import com.lds.enjoy1.cap8.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap8Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        System.out.println(app);
    }
}
