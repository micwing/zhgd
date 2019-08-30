/**
 * Description: 智慧工地-塔机监控系统-告警处理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:40
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceAlarmListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceAlarmRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceAlarmListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceAlarmResponse;

/**
 * 智慧工地-塔机监控系统-告警处理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmDeviceAlarm {

    /**
     * 智慧工地-塔机监控系统-告警处理列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-告警处理列表查询请求
     * @return 智慧工地-塔机监控系统-告警处理列表查询响应
     */
    TcsmDeviceAlarmListResponse getTcsmDeviceAlarmList(
            TcsmDeviceAlarmListRequest request);

    /**
     * 保存智慧工地-塔机监控系统-告警处理
     * 
     * @param request
     *            智慧工地-塔机监控系统-告警处理请求
     * @return 保存智慧工地-塔机监控系统-告警处理响应
     */
    TcsmDeviceAlarmResponse addTcsmDeviceAlarm(TcsmDeviceAlarmRequest request);

    /**
     * 删除智慧工地-塔机监控系统-告警处理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-告警处理响应
     */
    TcsmDeviceAlarmResponse deleteTcsmDeviceAlarmById(Long id);

    /**
     * 修改智慧工地-塔机监控系统-告警处理
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-告警处理请求
     * @return 修改智慧工地-塔机监控系统-告警处理响应
     */
    TcsmDeviceAlarmResponse updateTcsmDeviceAlarm(
            TcsmDeviceAlarmRequest request);

    /**
     * 通过ID获取智慧工地-塔机监控系统-告警处理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-告警处理响应
     */
    TcsmDeviceAlarmResponse getTcsmDeviceAlarmById(Long id);
    
    /**
     * 获取报警总数
     *
     * @param req 列表检索条件
     * @return 报警总数
     */
    int getTcsmDeviceRecordAlarmTotal(TcsmDeviceAlarmListRequest req);
}
