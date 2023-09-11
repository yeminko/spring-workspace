package com.example.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.example.models.Comment;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // @Around("execution(* com.example.services.*.*(..))")
    @Around("@annotation(com.example.annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) {

        Object returnedByMehod = new Object();

        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();

            logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute.");

            Comment comment = new Comment();
            comment.setText("Some other text!");
            Object[] newArguments = { comment };

            returnedByMehod = joinPoint.proceed(newArguments);

            logger.info("Method executed and returned " + returnedByMehod);

            return "FAILED";
        } catch (Throwable e) {
            logger.info("Failed to execute: " + e);
        }
        return "FAILED";
    }
}
