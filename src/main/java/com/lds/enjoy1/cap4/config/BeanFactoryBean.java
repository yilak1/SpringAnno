package com.lds.enjoy1.cap4.config;

import com.lds.enjoy1.cap4.bean.Shift;
import org.springframework.beans.factory.FactoryBean;

public class BeanFactoryBean  implements FactoryBean {

    public Object getObject() throws Exception {
        return new Shift();
    }

    public Class<?> getObjectType() {
        return Shift.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
