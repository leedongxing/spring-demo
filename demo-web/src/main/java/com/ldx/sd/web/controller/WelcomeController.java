/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: WelcomeController.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/21
 */

package com.ldx.sd.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-21 18:19
 * @lastdate:
 */

@Controller
@RequestMapping(value="/")
public class WelcomeController {
    private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @ResponseBody
    @RequestMapping(value = "index")
    public String index(){
        String res = "hello somebody";
        logger.info("--------"+res);
        return res;
    }
}
