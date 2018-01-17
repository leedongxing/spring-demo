/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: FunctionAnnotation.java project: spring-demo
 * @creator: lidongxing
 * @date: 2018/1/16
 */

package com.ldx.sd.service.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2018-01-16 18:03
 * @lastdate:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FunctionAnnotation {
    String name() default "methodName";
}
