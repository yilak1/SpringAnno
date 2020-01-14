package com.lds.enjoy1.cap9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.ObjectInputStream;
import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(* *..*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("除法运行。。。。。"+ joinPoint.getSignature().getName());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }

    @After("pointcut()")
    public void logEnd(){
        System.out.println("div end.......");
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public void logReturn(Object result){
        System.out.println("div return "+ result);
    }

    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void logException(Exception exception){
        System.out.println("div exception" + exception);
    }

    @Around("pointcut()")
    public Object Arount(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(" before");
        Object obj = joinPoint.proceed();
        System.out.println("after");
        return obj;
    }
}
