package com.zhhw.znh.yfb.tcsm.push;

import java.util.Date;
import java.util.List;

import org.apache.shiro.util.CollectionUtils;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;

public abstract class PushBase {

	private String messageType;
	private String groupMsgContent;
	private List<TcsmMessagePushPersonEntity> personList;
	private ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService;

	/**
	 * 异常推送zhu ru
	 * 
	 * @param tcsmMessagePersonRecordService
	 * @param tcsmMessagePushPersonService
	 */
	public PushBase(String messageType, 
			ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		this.messageType = messageType;
		this.tcsmMessagePersonRecordService = tcsmMessagePersonRecordService;
		this.personList = personList;
		this.groupMsgContent = groupMsgContent;
	}

	/**
	 * 异常消息推送给个人
	 */
	public void pushAll() {
		if (CollectionUtils.isEmpty(personList)) {
			return;
		}
		
		// 查询设置推送人员
		for (int i = 0; i < personList.size(); i++) {
			TcsmMessagePushPersonEntity person = personList.get(i);

			boolean sendStatus = sendAlarmInfo(person, groupMsgContent); // 发送第三方
			if (sendStatus) {
				TcsmMessagePersonRecordEntity personRecord = new TcsmMessagePersonRecordEntity();
				personRecord.setEfficient(1L);
				personRecord.setPushMessageTime(new Date());
				personRecord.setPushMessageContent(groupMsgContent);
				personRecord.setPushMessagePersonName(person.getMessagePushPersonName());
				personRecord.setPushMessagePersonPhone(person.getMessagePushPersonPhone());
				personRecord.setPushMessageSendStatus(1);
				personRecord.setPushMessageType(messageType);
				tcsmMessagePersonRecordService.save(personRecord);
			}
		}
	}

	// 发送第三方消息，如短信，app等
	public abstract boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent);

}
