/**
 * Description: 智慧工地-吊钩可视化系统-监控设备管理业务实现类
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
package com.zhhw.znh.yfb.tcsm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhhw.znh.yfb.framework.dao.interfaces.Dao;
import com.zhhw.znh.yfb.framework.service.impl.DefaultServiceImpl;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcvrDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcvrDeviceInfoDao;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcvrDeviceInfoService;

/**
 * 智慧工地-吊钩可视化系统-监控设备管理业务实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-24
 * @see
 * @since 1.0
 */
@Service("tcvrDeviceInfoService")
public class TcvrDeviceInfoServiceImpl<T extends TcvrDeviceInfoEntity> extends DefaultServiceImpl<T> implements ITcvrDeviceInfoService<T> {
	/**
	 * 自动注入的数据访问对象
	 */
	@Autowired
	private ITcvrDeviceInfoDao<T> tcvrDeviceInfoDao;

    @Override
    protected Dao<T> getDao() {
        return tcvrDeviceInfoDao;
    }
}