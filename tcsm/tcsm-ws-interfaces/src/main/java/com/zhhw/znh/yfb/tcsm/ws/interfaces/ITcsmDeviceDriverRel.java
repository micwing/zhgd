/**
 * Description: 智慧工地-塔机监控系统-设备司机关联WS接口
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

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceDriverRelListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceDriverRelRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceDriverRelListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceDriverRelResponse;

/**
 * 智慧工地-塔机监控系统-设备司机关联WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmDeviceDriverRel {

    /**
     * 智慧工地-塔机监控系统-设备司机关联列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备司机关联列表查询请求
     * @return 智慧工地-塔机监控系统-设备司机关联列表查询响应
     */
    TcsmDeviceDriverRelListResponse getTcsmDeviceDriverRelList(
            TcsmDeviceDriverRelListRequest request);

    /**
     * 保存智慧工地-塔机监控系统-设备司机关联
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备司机关联请求
     * @return 保存智慧工地-塔机监控系统-设备司机关联响应
     */
    TcsmDeviceDriverRelResponse addTcsmDeviceDriverRel(TcsmDeviceDriverRelRequest request);

    /**
     * 删除智慧工地-塔机监控系统-设备司机关联通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-设备司机关联响应
     */
    TcsmDeviceDriverRelResponse deleteTcsmDeviceDriverRelById(Long id);

    /**
     * 修改智慧工地-塔机监控系统-设备司机关联
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-设备司机关联请求
     * @return 修改智慧工地-塔机监控系统-设备司机关联响应
     */
    TcsmDeviceDriverRelResponse updateTcsmDeviceDriverRel(
            TcsmDeviceDriverRelRequest request);

    /**
     * 通过ID获取智慧工地-塔机监控系统-设备司机关联
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-设备司机关联响应
     */
    TcsmDeviceDriverRelResponse getTcsmDeviceDriverRelById(Long id);
}
