/**
 * Description: 智慧工地-塔机监控系统-塔机设备WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:41
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceInfoResponse;

/**
 * 智慧工地-塔机监控系统-塔机设备WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmDeviceInfo {

    /**
     * 智慧工地-塔机监控系统-塔机设备列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-塔机设备列表查询请求
     * @return 智慧工地-塔机监控系统-塔机设备列表查询响应
     */
    TcsmDeviceInfoListResponse getTcsmDeviceInfoList(
            TcsmDeviceInfoListRequest request);

    /**
     * 保存智慧工地-塔机监控系统-塔机设备
     * 
     * @param request
     *            智慧工地-塔机监控系统-塔机设备请求
     * @return 保存智慧工地-塔机监控系统-塔机设备响应
     */
    TcsmDeviceInfoResponse addTcsmDeviceInfo(TcsmDeviceInfoRequest request);

    /**
     * 删除智慧工地-塔机监控系统-塔机设备通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-塔机设备响应
     */
    TcsmDeviceInfoResponse deleteTcsmDeviceInfoById(Long id);

    /**
     * 修改智慧工地-塔机监控系统-塔机设备
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-塔机设备请求
     * @return 修改智慧工地-塔机监控系统-塔机设备响应
     */
    TcsmDeviceInfoResponse updateTcsmDeviceInfo(
            TcsmDeviceInfoRequest request);

    /**
     * 通过ID获取智慧工地-塔机监控系统-塔机设备
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-塔机设备响应
     */
    TcsmDeviceInfoResponse getTcsmDeviceInfoById(Long id);
}
