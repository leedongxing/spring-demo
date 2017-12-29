/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ItemController.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.web.controller;

import com.alibaba.fastjson.JSON;
import com.ldx.sd.service.item.ItemService;
import com.ldx.sd.client.constants.AppConstant;
import com.ldx.sd.client.constants.WebApplicationConstant;
import com.ldx.sd.client.item.ItemVo;
import com.ldx.sd.web.templateController.BaseTemplateController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 15:10
 * @lastdate:
 */
@RestController
@RequestMapping(value="/item")
public class ItemController {
    private static Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;
    /**
     * 获取数据）
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getList")
    @ResponseBody
    public Map<String, Object> getItemList(ModelMap modelMap) {
        modelMap.clear();
        Map<String, Object> map = new HashMap<String, Object>();

        List<ItemVo> itemList = itemService.getAllItemList();

        map.put(WebApplicationConstant.FLAG_STATUS, AppConstant.JSON_RESPONSE_STATUS_SUCCESS);
        map.put(WebApplicationConstant.FLAG_RESULT, itemList);

        logger.debug(JSON.toJSONString(modelMap));

        return map;
    }
}
