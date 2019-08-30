package com.zhhw.znh.yfb.tcsm.pushgroup;

import java.util.List;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;
/**
 * 
 * @author dingkai
 * dmb 智能广播  
 */
public class PushGroupDmb extends PushGroupBase {

	public PushGroupDmb(ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("智能广播", tcsmMessageGroupRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送dmb消息");
		
		return false;
	}
}
