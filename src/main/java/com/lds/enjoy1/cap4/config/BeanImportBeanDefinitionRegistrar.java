package com.lds.enjoy1.cap4.config;

import com.lds.enjoy1.cap4.bean.Pig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class BeanImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /*
     *AnnotationMetadata:当前类的注解信息
     *BeanDefinitionRegistry:BeanDefinition注册类
     *    把所有需要添加到容器中的bean加入;
     *    @Scope
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        boolean bean1 = registry.containsBeanDefinition("com.lds.enjoy1.cap4.bean.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.lds.enjoy1.cap4.bean.Cat");
        //如果Dog和Cat同时存在于我们IOC容器中，那么创建Pig类，加入到容器中
        if (bean1 && bean2){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", rootBeanDefinition);
        }

    }
}
