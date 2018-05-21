package com.apress.prospring4.ch5.Advice;


import org.aspectj.lang.JoinPoint;

public class MyAdvice {
//    If we using namespace aop, we don't need interface 'MethodBeforeAdvice'

    public void simpleBeforeAdvice(JoinPoint joinPoint, int intValue) {
//        If the advice needs access to the details of the cut we use JoinPoint
//        The arguments on this method arte not necessary
        if (intValue != 100) {
            System.out.println("Executing: " + joinPoint.getSignature().getDeclaringTypeName() + " "
                    + joinPoint.getSignature().getName() + ", argument: " + intValue);
        }
    }
}
