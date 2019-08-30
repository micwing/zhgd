/**
 * Description: 智慧工地-塔机监控系统-设备司机关联业务实现类
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
package com.zhhw.znh.yfb.tcsm.service.impl;

import java.util.List;

import com.zhhw.znh.yfb.framework.dao.interfaces.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcsmDeviceDriverRelDao;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceDriverRelService;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceDriverRelEntity;
import com.zhhw.znh.yfb.framework.service.impl.DefaultServiceImpl;

/**
 * 智慧工地-塔机监控系统-设备司机关联业务实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmDeviceDriverRelService")
public class TcsmDeviceDriverRelServiceImpl<T extends TcsmDeviceDriverRelEntity> extends DefaultServiceImpl<T> implements ITcsmDeviceDriverRelService<T> {
	/**
	 * 自动注入的数据访问对象
	 */
	@Autowired
	private ITcsmDeviceDriverRelDao<T> tcsmDeviceDriverRelDao;

    @Override
    protected Dao<T> getDao() {
        return tcsmDeviceDriverRelDao;
    }
}