/**
 * Description: 智慧工地-塔机监测系统-报警推送设置WS接口
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

import java.util.List;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushSetListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushSetRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushSetListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushSetResponse;

/**
 * 智慧工地-塔机监测系统-报警推送设置WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmMessagePushSet {

    /**
     * 智慧工地-塔机监测系统-报警推送设置列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警推送设置列表查询请求
     * @return 智慧工地-塔机监测系统-报警推送设置列表查询响应
     */
    TcsmMessagePushSetListResponse getTcsmMessagePushSetList(
            TcsmMessagePushSetListRequest request);

    /**
     * 保存智慧工地-塔机监测系统-报警推送设置
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警推送设置请求
     * @return 保存智慧工地-塔机监测系统-报警推送设置响应
     */
    TcsmMessagePushSetResponse addTcsmMessagePushSet(TcsmMessagePushSetRequest request);

    /**
     * 删除智慧工地-塔机监测系统-报警推送设置通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-报警推送设置响应
     */
    TcsmMessagePushSetResponse deleteTcsmMessagePushSetById(Long id);

    /**
     * 修改智慧工地-塔机监测系统-报警推送设置
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-报警推送设置请求
     * @return 修改智慧工地-塔机监测系统-报警推送设置响应
     */
    TcsmMessagePushSetResponse updateTcsmMessagePushSet(
            TcsmMessagePushSetRequest request);

    /**
     * 通过ID获取智慧工地-塔机监测系统-报警推送设置
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-报警推送设置响应
     */
    TcsmMessagePushSetResponse getTcsmMessagePushSetById(Long id);
    
    void pushPersonAlarm(List<TcsmMessagePushPersonEntity> personList, String content);
}
