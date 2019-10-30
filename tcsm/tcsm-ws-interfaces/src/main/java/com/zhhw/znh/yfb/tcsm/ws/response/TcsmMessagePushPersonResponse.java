/**
 * Description: 智慧工地-塔机监测系统-报警消息推送用户保存响应
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
package com.zhhw.znh.yfb.tcsm.ws.response;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.framework.ws.response.YfbResponse;

/**
 * 智慧工地-塔机监测系统-报警消息推送用户保存响应<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public class TcsmMessagePushPersonResponse extends YfbResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 智慧工地-塔机监测系统-报警消息推送用户实体对象
     */
    private TcsmMessagePushPersonEntity entity;

    /**
     * @return the entity
     */
    public TcsmMessagePushPersonEntity getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(TcsmMessagePushPersonEntity entity) {
        this.entity = entity;
    }
}