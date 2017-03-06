package com.github.mobile.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by apple on 3/6/17.
 */

@Aspect
public class TraceAspect {

    @AfterThrowing(pointcut = "call(* com.github.mobile.core.*.onException (..))", throwing = "e")
    public void errorInterceptor(JoinPoint joinPoint, Exception e) {
        String tag = joinPoint.getTarget().getClass().getName();
        String message = e.getCause().getMessage();

        exceptionLog.log(tag, message);
    }
}
