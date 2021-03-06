/**
 * Description: 智慧工地-塔机监控系统-设备上报参数日志保存响应
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:45
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.response;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapParamEntity;
import com.zhhw.znh.yfb.framework.ws.response.YfbResponse;

/**
 * 智慧工地-塔机监控系统-设备上报参数日志保存响应<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public class TcsmSnapParamResponse extends YfbResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 智慧工地-塔机监控系统-设备上报参数日志实体对象
     */
    private TcsmSnapParamEntity entity;

    /**
     * @return the entity
     */
    public TcsmSnapParamEntity getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(TcsmSnapParamEntity entity) {
        this.entity = entity;
    }
}