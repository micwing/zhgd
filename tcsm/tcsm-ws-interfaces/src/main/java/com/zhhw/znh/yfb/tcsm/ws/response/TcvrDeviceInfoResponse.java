/**
 * Description: 智慧工地-吊钩可视化系统-监控设备管理保存响应
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
package com.zhhw.znh.yfb.tcsm.ws.response;

import com.zhhw.znh.yfb.framework.ws.response.YfbResponse;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcvrDeviceInfoEntity;

/**
 * 智慧工地-吊钩可视化系统-监控设备管理保存响应<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-24
 * @see
 * @since 1.0
 */
public class TcvrDeviceInfoResponse extends YfbResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 智慧工地-吊钩可视化系统-监控设备管理实体对象
     */
    private TcvrDeviceInfoEntity entity;

    /**
     * @return the entity
     */
    public TcvrDeviceInfoEntity getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(TcvrDeviceInfoEntity entity) {
        this.entity = entity;
    }
}