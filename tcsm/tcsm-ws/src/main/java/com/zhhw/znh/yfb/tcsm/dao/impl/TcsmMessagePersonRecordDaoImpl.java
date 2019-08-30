/**
 * Description: 智慧工地-塔机监测系统-消息单人记录管理数据访问实现类
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
package com.zhhw.znh.yfb.tcsm.dao.impl;

import org.springframework.stereotype.Repository;

import com.zhhw.znh.yfb.framework.dao.impl.DefaultDaoImpl;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcsmMessagePersonRecordDao;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;

/**
 * 智慧工地-塔机监测系统-消息单人记录管理数据访问实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Repository("tcsmMessagePersonRecordDao")
public class TcsmMessagePersonRecordDaoImpl extends DefaultDaoImpl<TcsmMessagePersonRecordEntity> implements ITcsmMessagePersonRecordDao<TcsmMessagePersonRecordEntity>{
}
