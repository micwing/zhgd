/**
 * Description: 智慧工地-塔机监测系统-消息群发记录管理保存请求
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
package com.zhhw.znh.yfb.tcsm.ws.request;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.framework.ws.request.YfbRequest;

/**
 * 智慧工地-塔机监测系统-消息群发记录管理保存请求<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public class TcsmMessageGroupRecordRequest extends YfbRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 智慧工地-塔机监测系统-消息群发记录管理实体对象
     */
    private TcsmMessageGroupRecordEntity entity;

    /**
     * @return the entity
     */
    public TcsmMessageGroupRecordEntity getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(TcsmMessageGroupRecordEntity entity) {
        this.entity = entity;
    }
}