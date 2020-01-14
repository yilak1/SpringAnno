package com.lds.enjoy1.cap3.config;

import com.lds.enjoy1.cap1.Persion;
import com.lds.enjoy1.cap3.WInCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cap3MainConfig {

    @Bean
    @Conditional(WInCondition.class)
    public Persion persion(){
        return new Persion("name", 23);
    }
}
