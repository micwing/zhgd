/**
 * Description: 智慧工地-塔机监控系统-告警处理业务接口
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
package com.zhhw.znh.yfb.tcsm.service.interfaces;

import com.zhhw.znh.yfb.framework.service.interfaces.Service;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceAlarmEntity;

/**
 * 智慧工地-塔机监控系统-告警处理业务接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
public interface ITcsmDeviceAlarmService<T extends TcsmDeviceAlarmEntity> extends Service<T> {
}