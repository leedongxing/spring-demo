/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ControllerIntercepter.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.service.intercepter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 11:11
 * @lastdate:
 */

public class ControllerIntercepter extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===========HandlerInterceptor1 preHandle");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("===========HandlerInterceptor1 postHandle");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("===========HandlerInterceptor1 afterCompletion");
    }
}
