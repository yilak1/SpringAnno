package com.lds.enjoy1.cap2.config;

import com.lds.enjoy1.cap1.Persion;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.lds.enjoy1.cap2",
            includeFilters = @ComponentScan.Filter(type=FilterType.CUSTOM, classes = CustomTypeFilter.class), useDefaultFilters = false)
public class Cap2MainConfig {

    @Bean
    public Persion persion(){
        return new Persion("james",20);
    }
}
