package com.lds.enjoy1.cap6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:/test.properties")
public class Cap6MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }
}
