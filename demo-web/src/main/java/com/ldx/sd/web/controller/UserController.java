/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: UserController.java project: spring-demo
 * @creator: lidongxing
 * @date: 2018/1/17
 */

package com.ldx.sd.web.controller;

import com.alibaba.fastjson.JSON;
import com.ldx.sd.client.constants.AppConstant;
import com.ldx.sd.client.constants.WebApplicationConstant;
import com.ldx.sd.client.item.ItemVo;
import com.ldx.sd.client.item.UserVo;
import com.ldx.sd.service.annotations.FunctionAnnotation;
import com.ldx.sd.service.aspect.UserServcie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2018-01-17 14:59
 * @lastdate:
 */

@RestController
@RequestMapping(value="/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserServcie userServcie;

    /**
     * 获取数据
     * @param modelMap
     * @return
     */
    @FunctionAnnotation(name = "com.ldx.sd.web.controller.UserController.getInfo")
    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> getInfo(ModelMap modelMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            modelMap.clear();

            UserVo userVo = userServcie.getUser(20);

            map.put(WebApplicationConstant.FLAG_STATUS, AppConstant.JSON_RESPONSE_STATUS_SUCCESS);
            map.put(WebApplicationConstant.FLAG_RESULT, userVo);

            logger.info(JSON.toJSONString(modelMap));
        }catch (Exception e){
            logger.info("get user info error", e);
        }finally {
            logger.info("get user finally");
        }
        return map;
    }
}
