package com.lds.enjoy1.cap7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.lds.enjoy1.cap7")
public class Cap7MainConfig {

    @Primary
    @Bean("testDao2")
    public TestDao testDao(){
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }
}
