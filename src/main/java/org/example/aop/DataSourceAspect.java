package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataSourceAspect {
    @Pointcut("target(javax.sql.DataSource)")
    public void logMethodPointcut() {}


    @Around("logMethodPointcut()")
    public Object logAroundMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("data source tracker : "+ joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }
}
