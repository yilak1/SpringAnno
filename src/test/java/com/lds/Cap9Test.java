package com.lds;

import com.lds.enjoy1.cap9.Calculator;
import com.lds.enjoy1.cap9.Cap9MainConfigAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(Cap9MainConfigAOP.class);
        Calculator bean = anno.getBean(Calculator.class);
        int div = bean.div(4, 1);
        System.out.println(div);
    }
}
