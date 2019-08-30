package com.zhhw.znh.yfb.tcsm.push;

import java.util.List;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
/**
 * 
 * @author dingkai
 *
 */
public class PushTel extends PushBase {
	
	public PushTel(ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("电话", tcsmMessagePersonRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		System.out.println("推送tel消息");
		
		return false;
	}
	
}
