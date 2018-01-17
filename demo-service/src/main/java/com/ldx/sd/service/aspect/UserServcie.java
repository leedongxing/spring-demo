/**
 * @copyright: Copyright (c) 2015-2020 jd.com All Rights Reserved
 * @file: UserServcie.java project: spring-demo
 * @creator: lidongxing
 * @date: 2018/1/3
 */

package com.ldx.sd.service.aspect;

import com.ldx.sd.client.item.UserVo;

/**
 * @description:
 * @author: lidongxing
 * @requireNo:
 * @createdate: 2018-01-03 18:05
 * @lastdate:
 */

public interface UserServcie {
    UserVo getUser(int id);
}
