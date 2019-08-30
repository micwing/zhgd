/**
 * Description: 智慧工地-吊钩可视化系统-监控设备管理数据访问实现类
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
package com.zhhw.znh.yfb.tcsm.dao.impl;

import org.springframework.stereotype.Repository;

import com.zhhw.znh.yfb.framework.dao.impl.DefaultDaoImpl;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcvrDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcvrDeviceInfoDao;

/**
 * 智慧工地-吊钩可视化系统-监控设备管理数据访问实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-24
 * @see
 * @since 1.0
 */
@Repository("tcvrDeviceInfoDao")
public class TcvrDeviceInfoDaoImpl extends DefaultDaoImpl<TcvrDeviceInfoEntity> implements ITcvrDeviceInfoDao<TcvrDeviceInfoEntity>{
}
