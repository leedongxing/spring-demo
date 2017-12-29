/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ItemService.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.service.item;

import com.ldx.sd.client.item.ItemVo;

import java.util.List;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 15:24
 * @lastdate:
 */

public interface ItemService {
    List<ItemVo> getAllItemList();
}
