/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: UserAspect.java project: spring-demo
 * @creator: lidongxing
 * @date: 2018/1/16
 */

package com.ldx.sd.service.Aspects;

import com.ldx.sd.service.annotations.FunctionAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2018-01-16 18:26
 * @lastdate:
 */
@Component
@Aspect
public class UserAspect {
    private static final Logger log = LoggerFactory.getLogger(UserAspect.class);

    @Before(value = "@annotation(functionAnnotation)")
    public void beforeGreeting(FunctionAnnotation functionAnnotation) {
        log.info("before " + functionAnnotation.name() + " ...");
    }

    @Around(value = "@annotation(functionAnnotation)")
    public Object aroundGreeting(ProceedingJoinPoint pjd, FunctionAnnotation functionAnnotation) {
        Object result = null;
        try{
            result = pjd.proceed();
        } catch (Throwable e){
            log.error("gen error", e);
        }
        log.info("around " + functionAnnotation.name() + " ...");
        return  result;
    }

    @After(value = "@annotation(functionAnnotation)")
    public void afterGreeting(FunctionAnnotation functionAnnotation) {
        log.info("after " + functionAnnotation.name() + " ...");
    }
    @AfterReturning(value = "@annotation(functionAnnotation)")
    public void afterReturning(FunctionAnnotation functionAnnotation) {
        log.info("after returning " + functionAnnotation.name() + " ...");
    }
}
