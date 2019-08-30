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
package com.zhhw.znh.yfb.tcsm.ws.interfaces;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapCurrentEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapHeartbeatEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapParamEntity;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapCurrentDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapHeartbeatDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapParamDto;

public interface ITcsmApi {

	TcsmSnapHeartbeatEntity parseTcsmSnapHeartbeat(String json);
	
	TcsmSnapCurrentEntity parseTcsmSnapCurrent(String json);
	
	TcsmSnapParamEntity parseTcsmSnapParam(String json);

	
	
	TcsmSnapHeartbeatEntity parseTcsmSnapHeartbeat(SnapHeartbeatDto dto);
	
	TcsmSnapCurrentEntity parseTcsmSnapCurrent(SnapCurrentDto dto);
	
	TcsmSnapParamEntity parseTcsmSnapParam(SnapParamDto dto);
}
