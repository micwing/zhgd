package com.zhhw.znh.yfb.tcsm.parser;

import com.alibaba.fastjson.JSON;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapCurrentDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapHeartbeatDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapParamDto;

public class SnapParser {
	
	public static SnapHeartbeatDto parseHeartbeatDto(String json) {
		return JSON.parseObject(json, SnapHeartbeatDto.class);
	}
	
	public static SnapCurrentDto parseCurrentDto(String json) {
		return JSON.parseObject(json, SnapCurrentDto.class);
	}
	
	public static SnapParamDto parseParamDto(String json) {
		return JSON.parseObject(json, SnapParamDto.class);
	}
	
	
}
