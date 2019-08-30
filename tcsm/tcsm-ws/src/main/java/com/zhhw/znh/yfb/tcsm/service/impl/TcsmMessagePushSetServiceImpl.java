/**
 * Description: 智慧工地-塔机监测系统-报警推送设置业务实现类
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
package com.zhhw.znh.yfb.tcsm.service.impl;

import java.util.List;

import com.zhhw.znh.yfb.framework.dao.interfaces.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhhw.znh.yfb.tcsm.dao.interfaces.ITcsmMessagePushSetDao;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushSetService;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushSetEntity;
import com.zhhw.znh.yfb.framework.service.impl.DefaultServiceImpl;

/**
 * 智慧工地-塔机监测系统-报警推送设置业务实现类<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessagePushSetService")
public class TcsmMessagePushSetServiceImpl<T extends TcsmMessagePushSetEntity> extends DefaultServiceImpl<T> implements ITcsmMessagePushSetService<T> {
	/**
	 * 自动注入的数据访问对象
	 */
	@Autowired
	private ITcsmMessagePushSetDao<T> tcsmMessagePushSetDao;

    @Override
    protected Dao<T> getDao() {
        return tcsmMessagePushSetDao;
    }
}