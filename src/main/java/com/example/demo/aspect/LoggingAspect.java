package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void controllerMethods() {}
    
    @Before("controllerMethods()")
    public void logRequest(JoinPoint joinPoint) {
        logger.info("Request: {} {}", ((org.springframework.web.context.request.ServletRequestAttributes) org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes()).getRequest().getMethod(),
                ((org.springframework.web.context.request.ServletRequestAttributes) org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes()).getRequest().getRequestURI());
    }

    @AfterReturning(pointcut = "controllerMethods()", returning = "response")
    public void logResponse(Object response) {
        logger.info("Response: {}", response);
    }

    @AfterThrowing(pointcut = "controllerMethods()", throwing = "exception")
    public void logException(Exception exception) {
        logger.error("Exception: {}", exception.getMessage(), exception);
    }
}