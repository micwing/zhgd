/**
 * Description: 智慧工地-吊钩可视化系统-监控设备管理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-24 上午 09:07:44
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-24   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.ws.request.TcvrDeviceInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcvrDeviceInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcvrDeviceInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcvrDeviceInfoResponse;

/**
 * 智慧工地-吊钩可视化系统-监控设备管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-24
 * @see
 * @since 1.0
 */
public interface ITcvrDeviceInfo {

    /**
     * 智慧工地-吊钩可视化系统-监控设备管理列表查询
     * 
     * @param request
     *            智慧工地-吊钩可视化系统-监控设备管理列表查询请求
     * @return 智慧工地-吊钩可视化系统-监控设备管理列表查询响应
     */
    TcvrDeviceInfoListResponse getTcvrDeviceInfoList(
            TcvrDeviceInfoListRequest request);

    /**
     * 保存智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param request
     *            智慧工地-吊钩可视化系统-监控设备管理请求
     * @return 保存智慧工地-吊钩可视化系统-监控设备管理响应
     */
    TcvrDeviceInfoResponse addTcvrDeviceInfo(TcvrDeviceInfoRequest request);

    /**
     * 删除智慧工地-吊钩可视化系统-监控设备管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-吊钩可视化系统-监控设备管理响应
     */
    TcvrDeviceInfoResponse deleteTcvrDeviceInfoById(Long id);

    /**
     * 修改智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param request
     *            修改智慧工地-吊钩可视化系统-监控设备管理请求
     * @return 修改智慧工地-吊钩可视化系统-监控设备管理响应
     */
    TcvrDeviceInfoResponse updateTcvrDeviceInfo(
            TcvrDeviceInfoRequest request);

    /**
     * 通过ID获取智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-吊钩可视化系统-监控设备管理响应
     */
    TcvrDeviceInfoResponse getTcvrDeviceInfoById(Long id);
}
