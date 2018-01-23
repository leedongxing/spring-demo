/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ItemController.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.web.templateController;

import com.ldx.sd.service.item.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 15:10
 * @lastdate:
 */
@RestController
@RequestMapping(value="/itemTeplate")
public class ItemTemplateController extends BaseTemplateController {
    private static Logger logger = LoggerFactory.getLogger(ItemTemplateController.class);

    @Autowired
    private ItemService itemService;
    /**
     * 获取数据）
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getList")
    @ResponseBody
    public String getItemList(ModelMap modelMap) {
        String string = restTemplate.getForObject("http://localhost:8080/item/getList", String.class);

        return string;
    }
}
