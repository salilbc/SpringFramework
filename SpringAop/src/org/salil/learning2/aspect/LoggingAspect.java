package org.salil.learning2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void LoggingAdvice(){
        System.out.println("Advice Run. Get method called");
    }
}
