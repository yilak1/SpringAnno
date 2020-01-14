package com.lds.enjoy1.cap8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的IOC: " + applicationContext);
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String name) {
        System.out.println("当前的Bean的名字: "+ name);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        //用来解析String的值
        String result = resolver.resolveStringValue("你好${os.name}, 计算#{3*8}");
        System.out.println(result);
    }
}
