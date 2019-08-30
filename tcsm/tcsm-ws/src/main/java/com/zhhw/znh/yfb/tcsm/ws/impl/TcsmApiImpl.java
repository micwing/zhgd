/**
 * Description: 智慧工地-塔机监控系统-设备实时数据日志WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-25 下午 14:36:56
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-25   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapCurrentEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapHeartbeatEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapParamEntity;
import com.zhhw.znh.yfb.tcsm.parser.SnapCoverter;
import com.zhhw.znh.yfb.tcsm.parser.SnapParser;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapCurrentDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapHeartbeatDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapParamDto;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmApi;

/**
 * 智慧工地-塔机监控系统-设备实时数据日志WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-25
 * @see
 * @since 1.0
 */
@Service("tcsmApi")
public class TcsmApiImpl implements ITcsmApi {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmApiImpl.class);
    
    @Override
    public TcsmSnapHeartbeatEntity parseTcsmSnapHeartbeat(String json) {
    	SnapHeartbeatDto dto = SnapParser.parseHeartbeatDto(json);
    	TcsmSnapHeartbeatEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }

    @Override
    public TcsmSnapCurrentEntity parseTcsmSnapCurrent(String json) {
    	SnapCurrentDto dto = SnapParser.parseCurrentDto(json);
    	TcsmSnapCurrentEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }
    
    @Override
    public TcsmSnapParamEntity parseTcsmSnapParam(String json) {
    	SnapParamDto dto = SnapParser.parseParamDto(json);
    	TcsmSnapParamEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }
    
    
    
    @Override
    public TcsmSnapCurrentEntity parseTcsmSnapCurrent(SnapCurrentDto dto) {
    	TcsmSnapCurrentEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }
    
    @Override
    public TcsmSnapHeartbeatEntity parseTcsmSnapHeartbeat(SnapHeartbeatDto dto) {
    	TcsmSnapHeartbeatEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }
    
    @Override
    public TcsmSnapParamEntity parseTcsmSnapParam(SnapParamDto dto) {
    	TcsmSnapParamEntity e = SnapCoverter.toNewEntity(dto);
    	return e;
    }
    
}
