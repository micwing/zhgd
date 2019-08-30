package com.zhhw.znh.yfb.tcsm.push;

import java.util.List;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
/**
 * 
 * @author dingkai
 * dmb 智能广播  
 */
public class PushDmb extends PushBase {

	public PushDmb(ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("智能广播", tcsmMessagePersonRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送dmb消息");
		
		return false;
	}
	
}
