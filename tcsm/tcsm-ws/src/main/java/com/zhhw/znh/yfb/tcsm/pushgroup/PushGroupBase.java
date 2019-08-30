package com.zhhw.znh.yfb.tcsm.pushgroup;

import java.util.Date;
import java.util.List;

import org.apache.shiro.util.CollectionUtils;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;

public abstract class PushGroupBase {

	private String messageType;
	private String groupMsgContent;
	private List<TcsmMessagePushPersonEntity> personList;
	private ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService;

	/**
	 * 群推送注入
	 */
	public PushGroupBase(String messageType, ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		this.messageType = messageType;
		this.tcsmMessageGroupRecordService = tcsmMessageGroupRecordService;
		this.personList = personList;
		this.groupMsgContent = groupMsgContent;
	}

	/**
	 * 发送群消息
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
				TcsmMessageGroupRecordEntity groupRecord = new TcsmMessageGroupRecordEntity();
				groupRecord.setEfficient(1L);
				groupRecord.setPushMessageTime(new Date());
				groupRecord.setPushMessageContent(groupMsgContent);
				groupRecord.setPushMessageSendStatus(1);
				groupRecord.setCreateTime(new Date());
				groupRecord.setPushMessageType(messageType);
				groupRecord.setRemark(person.getMessagePushPersonName() + ":" + person.getMessagePushPersonPhone() + ":"
						+ groupMsgContent);
				groupRecord.setPushMoudleType("全部模块");
				tcsmMessageGroupRecordService.save(groupRecord);
			}
		}
	}

	// 发送第三方消息，如短信，app等
	public abstract boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent);

}
