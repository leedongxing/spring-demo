/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: BaseTemplateController.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.web.templateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 14:30
 * @lastdate:
 */

public class BaseTemplateController {
    @Autowired
    protected
    RestTemplate restTemplate;
}
