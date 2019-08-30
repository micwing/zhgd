package com.zhhw.znh.yfb.tcsm.pushgroup;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhhw.znh.yfb.common.tools.getui.MessageBean;
import com.zhhw.znh.yfb.common.tools.umeng.UmDemo;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;

/**
 * app 推送
 * 
 * @author dingkai app
 */
public class PushGroupApp extends PushGroupBase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PushGroupApp.class);

	public PushGroupApp(ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("App", tcsmMessageGroupRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		try {
			MessageBean message = new MessageBean();
			message.setContent(groupMsgContent);
			//message.setPicUrl(map.get("msgId").toString());
			message.setMsgId(System.currentTimeMillis()+"");
			message.setTitle("塔机监控系统告警信息");
			message.setDate(new Date());
			message.setUrl("http://222.190.123.210:8050/#/TcsmIndex");
//	    	PushToApp.pushToApp(message);
	    	
	    	UmDemo demo = new UmDemo();
	    	demo.sendAndroidBroadcast(message);
	    	
	    	LOGGER.info("发送塔机报警APP推送："+groupMsgContent);
	    	
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return true;
	}

}
