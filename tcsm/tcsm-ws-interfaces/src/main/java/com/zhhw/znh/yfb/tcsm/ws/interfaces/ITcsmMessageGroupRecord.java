/**
 * Description: 智慧工地-塔机监测系统-消息群发记录管理WS接口
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

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupRecordListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupRecordRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupRecordListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupRecordResponse;

/**
 * 智慧工地-塔机监测系统-消息群发记录管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmMessageGroupRecord {

    /**
     * 智慧工地-塔机监测系统-消息群发记录管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发记录管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息群发记录管理列表查询响应
     */
    TcsmMessageGroupRecordListResponse getTcsmMessageGroupRecordList(
            TcsmMessageGroupRecordListRequest request);

    /**
     * 保存智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发记录管理请求
     * @return 保存智慧工地-塔机监测系统-消息群发记录管理响应
     */
    TcsmMessageGroupRecordResponse addTcsmMessageGroupRecord(TcsmMessageGroupRecordRequest request);

    /**
     * 删除智慧工地-塔机监测系统-消息群发记录管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息群发记录管理响应
     */
    TcsmMessageGroupRecordResponse deleteTcsmMessageGroupRecordById(Long id);

    /**
     * 修改智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息群发记录管理请求
     * @return 修改智慧工地-塔机监测系统-消息群发记录管理响应
     */
    TcsmMessageGroupRecordResponse updateTcsmMessageGroupRecord(
            TcsmMessageGroupRecordRequest request);

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息群发记录管理响应
     */
    TcsmMessageGroupRecordResponse getTcsmMessageGroupRecordById(Long id);
}
