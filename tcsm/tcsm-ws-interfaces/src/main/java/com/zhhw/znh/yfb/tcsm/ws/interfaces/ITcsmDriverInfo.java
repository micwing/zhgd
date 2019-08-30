/**
 * Description: 智慧工地-塔机监控系统-司机信息WS接口
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

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDriverInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDriverInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDriverInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDriverInfoResponse;

/**
 * 智慧工地-塔机监控系统-司机信息WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmDriverInfo {

    /**
     * 智慧工地-塔机监控系统-司机信息列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-司机信息列表查询请求
     * @return 智慧工地-塔机监控系统-司机信息列表查询响应
     */
    TcsmDriverInfoListResponse getTcsmDriverInfoList(
            TcsmDriverInfoListRequest request);

    /**
     * 保存智慧工地-塔机监控系统-司机信息
     * 
     * @param request
     *            智慧工地-塔机监控系统-司机信息请求
     * @return 保存智慧工地-塔机监控系统-司机信息响应
     */
    TcsmDriverInfoResponse addTcsmDriverInfo(TcsmDriverInfoRequest request);

    /**
     * 删除智慧工地-塔机监控系统-司机信息通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-司机信息响应
     */
    TcsmDriverInfoResponse deleteTcsmDriverInfoById(Long id);

    /**
     * 修改智慧工地-塔机监控系统-司机信息
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-司机信息请求
     * @return 修改智慧工地-塔机监控系统-司机信息响应
     */
    TcsmDriverInfoResponse updateTcsmDriverInfo(
            TcsmDriverInfoRequest request);

    /**
     * 通过ID获取智慧工地-塔机监控系统-司机信息
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-司机信息响应
     */
    TcsmDriverInfoResponse getTcsmDriverInfoById(Long id);
}
