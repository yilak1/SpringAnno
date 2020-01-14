package com.lds;

import com.lds.enjoy1.cap11.Cap11MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap11Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(Cap11MainConfig.class);

    }
}
