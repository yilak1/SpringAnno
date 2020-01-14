package com.lds.enjoy1.cap1.config;

import com.lds.enjoy1.cap1.Persion;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(value = "com.lds.enjoy1.cap1", includeFilters = @ComponentScan.Filter()
)
public class Config {

    @Bean
    public Persion persion(){
        return new Persion("lds", 23);
    }

}
