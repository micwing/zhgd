/**
 * Description: 智慧工地-塔机监控系统-设备心跳日志业务实现类
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:44
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.service.impl;

import java.util.List;

import com.zhhw.znh.yfb.framework.dao.interfaces.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcsmSnapHeartbeatDao;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmSnapHeartbeatService;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapHeartbeatEntity;
import com.zhhw.znh.yfb.framework.service.impl.DefaultServiceImpl;

/**
 * 智慧工地-塔机监控系统-设备心跳日志业务实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmSnapHeartbeatService")
public class TcsmSnapHeartbeatServiceImpl<T extends TcsmSnapHeartbeatEntity> extends DefaultServiceImpl<T> implements ITcsmSnapHeartbeatService<T> {
	/**
	 * 自动注入的数据访问对象
	 */
	@Autowired
	private ITcsmSnapHeartbeatDao<T> tcsmSnapHeartbeatDao;

    @Override
    protected Dao<T> getDao() {
        return tcsmSnapHeartbeatDao;
    }
}