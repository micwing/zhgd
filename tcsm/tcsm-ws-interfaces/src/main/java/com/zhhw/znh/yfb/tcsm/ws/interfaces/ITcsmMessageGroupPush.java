/**
 * Description: 智慧工地-塔机监测系统-消息群发管理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:42
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupPushListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupPushRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupPushListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupPushResponse;

/**
 * 智慧工地-塔机监测系统-消息群发管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmMessageGroupPush {

    /**
     * 智慧工地-塔机监测系统-消息群发管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息群发管理列表查询响应
     */
    TcsmMessageGroupPushListResponse getTcsmMessageGroupPushList(
            TcsmMessageGroupPushListRequest request);

    /**
     * 保存智慧工地-塔机监测系统-消息群发管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发管理请求
     * @return 保存智慧工地-塔机监测系统-消息群发管理响应
     */
    TcsmMessageGroupPushResponse addTcsmMessageGroupPush(TcsmMessageGroupPushRequest request);

    /**
     * 删除智慧工地-塔机监测系统-消息群发管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息群发管理响应
     */
    TcsmMessageGroupPushResponse deleteTcsmMessageGroupPushById(Long id);

    /**
     * 修改智慧工地-塔机监测系统-消息群发管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息群发管理请求
     * @return 修改智慧工地-塔机监测系统-消息群发管理响应
     */
    TcsmMessageGroupPushResponse updateTcsmMessageGroupPush(
            TcsmMessageGroupPushRequest request);

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息群发管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息群发管理响应
     */
    TcsmMessageGroupPushResponse getTcsmMessageGroupPushById(Long id);
}
