package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CallTracker {


    @Pointcut("execution(public * save(*))")
    public void logMethodPointcut() {}

    @Before("logMethodPointcut()")
    public void beforeAdvice(){
        System.out.println("method starting");
    }

    @After("logMethodPointcut()")
    public void aferMethodAdvice(){
        System.out.println("after method finished");
    }


    /*@Around("logMethodPointcut()")
    public Object logAroundMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("after method finished");
        return joinPoint.proceed();

    }*/
}
