package com.lds;

import com.lds.enjoy1.cap10.Cap10MainConfig;
import com.lds.enjoy1.cap10.OrderService;
import com.lds.enjoy1.cap9.Cap9MainConfigAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
        OrderService  orderService= (OrderService) app.getBean("orderService");
        orderService.addOrder();
        app.close();

    }
}
