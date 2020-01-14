package com.lds.enjoy1.cap9;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lds.enjoy1.cap9")
@EnableAspectJAutoProxy
@Import(LogAspects.class)
public class Cap9MainConfigAOP {

}
