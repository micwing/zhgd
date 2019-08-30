package com.zhhw.znh.yfb.tcsm.pushgroup;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;
/**
 * 声光报警
 * @author dingkai
 *  
 */
public class PushGroupSal extends PushGroupBase {
	
	public PushGroupSal(ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("声光报警", tcsmMessageGroupRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送sal消息");
		
		return false;
	}
	
}
