/**
 * Description: 智慧工地-塔机监控系统-设备心跳日志WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:44
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapHeartbeatListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapHeartbeatRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapHeartbeatListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapHeartbeatResponse;

/**
 * 智慧工地-塔机监控系统-设备心跳日志WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmSnapHeartbeat {

    /**
     * 智慧工地-塔机监控系统-设备心跳日志列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备心跳日志列表查询请求
     * @return 智慧工地-塔机监控系统-设备心跳日志列表查询响应
     */
    TcsmSnapHeartbeatListResponse getTcsmSnapHeartbeatList(
            TcsmSnapHeartbeatListRequest request);

    /**
     * 保存智慧工地-塔机监控系统-设备心跳日志
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备心跳日志请求
     * @return 保存智慧工地-塔机监控系统-设备心跳日志响应
     */
    TcsmSnapHeartbeatResponse addTcsmSnapHeartbeat(TcsmSnapHeartbeatRequest request);

    /**
     * 删除智慧工地-塔机监控系统-设备心跳日志通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-设备心跳日志响应
     */
    TcsmSnapHeartbeatResponse deleteTcsmSnapHeartbeatById(Long id);

    /**
     * 修改智慧工地-塔机监控系统-设备心跳日志
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-设备心跳日志请求
     * @return 修改智慧工地-塔机监控系统-设备心跳日志响应
     */
    TcsmSnapHeartbeatResponse updateTcsmSnapHeartbeat(
            TcsmSnapHeartbeatRequest request);

    /**
     * 通过ID获取智慧工地-塔机监控系统-设备心跳日志
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-设备心跳日志响应
     */
    TcsmSnapHeartbeatResponse getTcsmSnapHeartbeatById(Long id);
}
