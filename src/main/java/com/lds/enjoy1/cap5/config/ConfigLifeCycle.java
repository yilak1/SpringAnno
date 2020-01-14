package com.lds.enjoy1.cap5.config;

import com.lds.enjoy1.cap5.bean.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lds.enjoy1.cap5.bean")
public class ConfigLifeCycle {

    @Bean(value = "bike", initMethod = "init", destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }
}
