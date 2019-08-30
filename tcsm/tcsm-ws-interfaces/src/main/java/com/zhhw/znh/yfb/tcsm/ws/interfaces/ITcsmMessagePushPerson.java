/**
 * Description: 智慧工地-塔机监测系统-报警消息推送用户WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:43
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushPersonListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushPersonRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushPersonListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushPersonResponse;

/**
 * 智慧工地-塔机监测系统-报警消息推送用户WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmMessagePushPerson {

    /**
     * 智慧工地-塔机监测系统-报警消息推送用户列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警消息推送用户列表查询请求
     * @return 智慧工地-塔机监测系统-报警消息推送用户列表查询响应
     */
    TcsmMessagePushPersonListResponse getTcsmMessagePushPersonList(
            TcsmMessagePushPersonListRequest request);
    
    TcsmMessagePushPersonListResponse queryAll();

    /**
     * 保存智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警消息推送用户请求
     * @return 保存智慧工地-塔机监测系统-报警消息推送用户响应
     */
    TcsmMessagePushPersonResponse addTcsmMessagePushPerson(TcsmMessagePushPersonRequest request);

    /**
     * 删除智慧工地-塔机监测系统-报警消息推送用户通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-报警消息推送用户响应
     */
    TcsmMessagePushPersonResponse deleteTcsmMessagePushPersonById(Long id);

    /**
     * 修改智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-报警消息推送用户请求
     * @return 修改智慧工地-塔机监测系统-报警消息推送用户响应
     */
    TcsmMessagePushPersonResponse updateTcsmMessagePushPerson(
            TcsmMessagePushPersonRequest request);

    /**
     * 通过ID获取智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-报警消息推送用户响应
     */
    TcsmMessagePushPersonResponse getTcsmMessagePushPersonById(Long id);
}
