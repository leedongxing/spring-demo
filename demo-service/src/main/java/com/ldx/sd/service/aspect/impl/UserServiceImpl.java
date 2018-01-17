/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: UserServiceImpl.java project: spring-demo
 * @creator: lidongxing
 * @date: 2018/1/3
 */

package com.ldx.sd.service.aspect.impl;

import com.ldx.sd.client.item.UserVo;
import com.ldx.sd.service.aspect.UserServcie;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2018-01-03 18:05
 * @lastdate:
 */

@Service("userService")
public class UserServiceImpl implements UserServcie{

    public UserVo getUser(int id){
        UserVo userVo = new UserVo();
        userVo.setId(id);
        userVo.setName("longke");
        return userVo;
    }
}
