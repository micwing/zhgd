package com.zhhw.znh.yfb.tcsm.push;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhhw.znh.yfb.framework.beans.SmsSendVo;
import com.zhhw.znh.yfb.framework.beans.SmsVo;
import com.zhhw.znh.yfb.framework.util.SmsUtils;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
/**
 * 
 * @author dingkai
 *
 */
public class PushSms extends PushBase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PushSms.class);
	
	public PushSms(ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService,
			List<TcsmMessagePushPersonEntity> personList, String groupMsgContent) {
		super("短信", tcsmMessagePersonRecordService, personList, groupMsgContent);
	}

	@Override
	public boolean sendAlarmInfo(TcsmMessagePushPersonEntity person, String groupMsgContent) {
		if (StringUtils.isEmpty(person.getMessagePushPersonPhone())) {
			LOGGER.error("给"+person.getMessagePushPersonName()+person.getMessagePushPersonPhone()+"推送短信消息失败，号码为空！"+groupMsgContent);
			return false;
		}
		
        SmsVo smsVo = new SmsVo();
        smsVo.setAllReceivers(person.getMessagePushPersonPhone());
        smsVo.setContent(groupMsgContent);
        smsVo.setLongSms(false);
        SmsSendVo smsSendVo = SmsUtils.sendSms(smsVo);
        
        if (0 < smsSendVo.getNum()) {
        	LOGGER.info("给"+person.getMessagePushPersonName()+person.getMessagePushPersonPhone()+"推送短信消息:"+groupMsgContent);
        	return true;
        } else {
        	return false;
        }
        
	}
	
}
