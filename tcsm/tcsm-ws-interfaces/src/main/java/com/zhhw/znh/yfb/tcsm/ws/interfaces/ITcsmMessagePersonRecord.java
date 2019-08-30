/**
 * Description: 智慧工地-塔机监测系统-消息单人记录管理WS接口
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

import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePersonRecordListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePersonRecordRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePersonRecordListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePersonRecordResponse;

/**
 * 智慧工地-塔机监测系统-消息单人记录管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmMessagePersonRecord {

    /**
     * 智慧工地-塔机监测系统-消息单人记录管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息单人记录管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息单人记录管理列表查询响应
     */
    TcsmMessagePersonRecordListResponse getTcsmMessagePersonRecordList(
            TcsmMessagePersonRecordListRequest request);

    /**
     * 保存智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息单人记录管理请求
     * @return 保存智慧工地-塔机监测系统-消息单人记录管理响应
     */
    TcsmMessagePersonRecordResponse addTcsmMessagePersonRecord(TcsmMessagePersonRecordRequest request);

    /**
     * 删除智慧工地-塔机监测系统-消息单人记录管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息单人记录管理响应
     */
    TcsmMessagePersonRecordResponse deleteTcsmMessagePersonRecordById(Long id);

    /**
     * 修改智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息单人记录管理请求
     * @return 修改智慧工地-塔机监测系统-消息单人记录管理响应
     */
    TcsmMessagePersonRecordResponse updateTcsmMessagePersonRecord(
            TcsmMessagePersonRecordRequest request);

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息单人记录管理响应
     */
    TcsmMessagePersonRecordResponse getTcsmMessagePersonRecordById(Long id);
}
