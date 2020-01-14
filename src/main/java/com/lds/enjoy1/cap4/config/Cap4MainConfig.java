package com.lds.enjoy1.cap4.config;

import com.lds.enjoy1.cap4.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Cat.class, BeanImportSelector.class, BeanImportBeanDefinitionRegistrar.class})
public class Cap4MainConfig {
    @Bean("beanFactoryBean")
    public BeanFactoryBean bean(){
        return new BeanFactoryBean();
    }
}
