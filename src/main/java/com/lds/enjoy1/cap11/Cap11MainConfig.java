package com.lds.enjoy1.cap11;

import com.lds.enjoy1.cap7.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lds.enjoy1.cap11")
public class Cap11MainConfig {
    @Bean
    public Moon getMoon(){
        return new Moon();
    }
}
