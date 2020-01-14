package com.lds.enjoy1.cap4.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BeanImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //importingClassMetadata.getClassName();
        return new String[]{"com.lds.enjoy1.cap4.bean.Dog", "com.lds.enjoy1.cap4.bean.Fish"};
    }
}
