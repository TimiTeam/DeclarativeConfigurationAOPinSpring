package com.apress.prospring4.ch5.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
// Annotation '@Aspect' declare the class like aspect class
public class MyAdvice {

    @Pointcut("execution(* com.apress.prospring4.ch5.annotation..foo*(int )) && args(intValue)")
    public void fooExecution(int intValue) {
    }

    @Pointcut("bean(myDependency)")
    public void inMyDependency() {

    }

    @Before("fooExecution(intValue) && inMyDependency()")
    public void simpleBeforeAdvice(JoinPoint joinPoint, int intValue) {
        if (intValue != 100) {
            System.out.println("Execution: " + joinPoint.getSignature().getDeclaringTypeName() + " "
                    + joinPoint.getSignature().getName() + ", argument: " + intValue);
        }
    }

    @Around("fooExecution(intValue) && inMyDependency()")
    public Object simpleAroundAdvice(ProceedingJoinPoint joinPoint, int intValue) throws Throwable {
        System.out.println("Before execution: " + joinPoint.getSignature().getDeclaringTypeName() + " "
                + joinPoint.getSignature().getName() + ", argument: " + intValue);

        Object returnObject = joinPoint.proceed();

        System.out.println("After execution: " + joinPoint.getSignature().getDeclaringTypeName() + " "
                + joinPoint.getSignature().getName() + ", argument: " + intValue);

        return returnObject;
    }
}
