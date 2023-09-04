package com.example.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) {

        Object returnedByMehod = new Object();

        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();

            logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute.");

            returnedByMehod = joinPoint.proceed();

            logger.info("Method executed and returned " + returnedByMehod);

            return returnedByMehod;
        } catch (Throwable e) {
            logger.info("Failed to execute: " + e);
        }
        return returnedByMehod;
    }
}
