/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: ItemServiceImpl.java project: spring-demo
 * @creator: lidongxing
 * @date: 2017/12/22
 */

package com.ldx.sd.service.item.impl;

import com.ldx.sd.service.item.ItemService;
import com.ldx.sd.client.item.ItemVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2017-12-22 15:25
 * @lastdate:
 */

@Service("itemService")
public class ItemServiceImpl implements ItemService {
    @Override
    public List<ItemVo> getAllItemList(){
        List<ItemVo> list = new ArrayList<ItemVo>();
        ItemVo itemVo = new ItemVo();
        itemVo.setId(12);
        itemVo.setName("360智能摄像机大众版 ");
        list.add(itemVo);
        return list;
    }
}
