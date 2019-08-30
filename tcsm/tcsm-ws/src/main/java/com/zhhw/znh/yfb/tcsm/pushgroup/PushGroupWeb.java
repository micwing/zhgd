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
public class PushGroupWeb extends PushGroupBase {
	
	public PushGroupWeb(ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("Web", tcsmMessageGroupRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送web消息");
		
		return false;
	}
	
}
