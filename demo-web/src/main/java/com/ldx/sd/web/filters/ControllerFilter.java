/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ControllerBeforeFilter.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/21
 */

package com.ldx.sd.web.filters;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-21 18:32
 * @lastdate:
 */

public class ControllerFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(ControllerFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("ControllerBeforeFilter init...");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.debug("ControllerBeforeFilter doFilter begin...");
        filterChain.doFilter(servletRequest, servletResponse);
        logger.debug("ControllerBeforeFilter doFilter end...");
    }

    public void destroy() {
        logger.debug("ControllerBeforeFilter destroy...");
    }
}
