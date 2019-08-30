package com.zhhw.znh.yfb.tcsm.pushgroup;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;
/**
 * 
 * @author dingkai
 *
 */
public class PushGroupTel extends PushGroupBase {
	
	public PushGroupTel(ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("电话", tcsmMessageGroupRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送tel消息");
		
		return false;
	}
	
}
