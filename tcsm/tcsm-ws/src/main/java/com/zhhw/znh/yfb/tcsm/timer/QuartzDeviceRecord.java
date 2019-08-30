//package com.zhhw.znh.yfb.tcsm.timer;
//
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceAlarmEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceManageEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceRecordEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceUsageEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
//import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushSetEntity;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceAlarmService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceManageService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceRecordService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceUsageService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushPersonService;
//import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushSetService;
//import com.zhhw.znh.yfb.tcsm.util.HttpRequestUtil;
//import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceManage;
//import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceRecord;
//import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePersonRecord;
//import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePushPerson;
//import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePushSet;
//import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceManageListRequest;
//import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceRecordListRequest;
//import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceRecordRequest;
//import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceManageListResponse;
//import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushSetResponse;
//import com.zhhw.znh.yfb.tcsm.push.PushApp;
//import com.zhhw.znh.yfb.tcsm.push.PushBase;
//import com.zhhw.znh.yfb.tcsm.push.PushDmb;
//import com.zhhw.znh.yfb.tcsm.push.PushSal;
//import com.zhhw.znh.yfb.tcsm.push.PushSms;
//import com.zhhw.znh.yfb.tcsm.push.PushTel;
//import com.zhhw.znh.yfb.tcsm.push.PushWeb;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//
//@Lazy(false)
//@Component(value = "QuartzDeviceRecord")
//@EnableScheduling
//public class QuartzDeviceRecord {
// 
//	
//	@Autowired
//    ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService;
//
//	 
//	@Autowired
//	ITcsmMessagePushPersonService<TcsmMessagePushPersonEntity> tcsmMessagePushPersonService;
//
//	 
//	
//	 @Autowired
//	 ITcsmDeviceManageService<TcsmDeviceManageEntity> tcsmDeviceManageService;
//	 
//	 /**
//     * 智慧工地-塔机监测系统-设备记录管理服务对象
//     */
//    @Autowired
//    ITcsmDeviceRecordService<TcsmDeviceRecordEntity> tcsmDeviceRecordService;
//    
//	@Autowired
//	private ITcsmDeviceAlarmService<TcsmDeviceAlarmEntity> tcsmDeviceAlarmService;
//	
//	 @Autowired
//	 ITcsmDeviceUsageService<TcsmDeviceUsageEntity> tcsmDeviceUsageService;
//    @Autowired
//    PushWeb pushWeb;
//    
//    @Autowired
//    PushApp pushApp;
//    @Autowired
//    PushDmb pushDmb;
//    @Autowired
//    PushSal pushSal;
//    @Autowired
//    PushSms pushSms;
//    @Autowired
//    PushTel pushTel;
//    
//	/**
//	 * 报警推送设置
//	 */
//	//@Autowired
//	private ITcsmMessagePushSet tcsmMessagePushSet;
//	 @Autowired
//	 ITcsmMessagePushSetService<TcsmMessagePushSetEntity> tcsmMessagePushSetService;
//	 
//	
//	
//	@Scheduled(cron = "0 * * * * *")
//	public void updateOnlineStatus() throws Exception {
////		Map<String, Object> param = new HashMap<>();
////		TcsmDeviceManageListRequest req = new TcsmDeviceManageListRequest();
////		req.setSearchParams(param);
//	//	TcsmDeviceManageListResponse response = tcsmDeviceManageService.queryAll();
//		List<TcsmDeviceManageEntity> list = tcsmDeviceManageService.queryAll();//response.getObjectList();
//		if(list!=null && list.size() >0) {
//			for (int i = 0; i < list.size(); i++) {
//				TcsmDeviceManageEntity deviceManageEntity = list.get(i);
//				String deviceEquipmentId = deviceManageEntity.getDeviceEquipmentId(); //对接设备ID
//				getRecord(deviceEquipmentId);
//			}
//		}
//		
//
////		tcsmMessagePersonRecord
//	}
//
//	public static void main(String[] args) throws Exception {
//		// setting();
////		getRecord("868744038836429");
//	}
//
//	
//
//	/**
//	 * 获取实时数据
//	 * 
//	 * @throws Exception
//	 */
//	public  void getRecord(String deviceEquipmentId ) throws Exception {
//
//		HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
//		String uri = "http://iot.zc-sensor.com/nbiot/informationApi/getCurrentData.shtml?equipmentId="+deviceEquipmentId;
//		String result = httpRequestUtil.doGet(uri);
//		System.out.println(result);
//
//		JSONObject jsonBean = JSONObject.fromObject(result);
//
//		Object msg = jsonBean.get("msg");
//		if (msg == null) {
//			TcsmDeviceRecordEntity deviceRecordEntity = new TcsmDeviceRecordEntity();
//
//			String equipmentId = jsonBean.getString(("equipmentId"));
//			deviceRecordEntity.setDeviceEquipmentId(equipmentId);
//
//			String deviceEquipmentName = jsonBean.getString("equipmentName");
//			deviceRecordEntity.setDeviceEquipmentName(deviceEquipmentName);
//
//			Integer deviceMessageId = jsonBean.getInt("messageId");
//			deviceRecordEntity.setDeviceMessageId(deviceMessageId);
//
//			String deviceMessageType = jsonBean.getString("messageType");
//			deviceRecordEntity.setDeviceMessageType(deviceMessageType);
//
//			Long deviceSn = jsonBean.getLong("sn");
//			deviceRecordEntity.setDeviceSn(deviceSn);
//
//			BigDecimal deviceAngleX = BigDecimal.valueOf(jsonBean.getDouble("angleX"));
//			deviceRecordEntity.setDeviceAngleX(deviceAngleX);
//			// 0 为未报警，1 为报警
//			Integer deviceAlaemX = jsonBean.getInt("alarmX");
//			deviceAlaemX =1;
//			
//			deviceRecordEntity.setDeviceAlaemX(deviceAlaemX);
//			
//			BigDecimal deviceAngleY = BigDecimal.valueOf(jsonBean.getDouble("angleY"));
//			deviceRecordEntity.setDeviceAngleY(deviceAngleY);
//
//			// 0 为未报警，1 为报警
//			Integer deviceAlaemY = jsonBean.getInt("alarmY");
//			deviceRecordEntity.setDeviceAlaemY(deviceAlaemY);
//			// deviceAlaemY =1;
//
//			BigDecimal devicePower = BigDecimal.valueOf(jsonBean.getLong("power"));
//			deviceRecordEntity.setDevicePower(devicePower);
//
//			String checksum = jsonBean.getString("checksum");
//			if (null != checksum && !"null".equals(checksum)) {
//				deviceRecordEntity.setDeviceCheckSum(jsonBean.getLong("checksum"));
//			}
//			deviceRecordEntity.setDeviceEventTimeStr(jsonBean.get("eventTime").toString());
//			System.out.println(deviceRecordEntity.toString());
//			//tcsmDeviceRecord.
//			//查询返回数据日期是否相同，相同则不存
//             Map<String, Object> recordCountParams = new HashMap<String, Object>();
//             recordCountParams.put("EQ_deviceEventTime", deviceRecordEntity.getDeviceEventTimeStr());
//             QueryParams<TcsmDeviceRecordEntity> queryParams = new QueryParams<TcsmDeviceRecordEntity>( recordCountParams);
//             
//             Integer todayOperateRecordCount = tcsmDeviceRecordService.getTotalCount(queryParams);
//             //未查到数据，新增记录
//              if(todayOperateRecordCount <=0) {
//				if (deviceAlaemY == 1 || deviceAlaemX == 1) {
//					System.out.println("有设备报警");
//					
//					//查推送设置推送人员
//					//TcsmMessagePushSetResponse messagePushSetResponse = tcsmMessagePushSetService.getById(1L)
//					//依据设置内容，添加推送记录表
//					TcsmMessagePushSetEntity messagePushSetEntity= tcsmMessagePushSetService.getById(1L);//messagePushSetResponse.getEntity();
//					//messagePushSetEntity.get
//					Integer webpush =messagePushSetEntity.getWebPushSwitchStatus();
//					if(webpush==1) {
//						pushWeb.pushPerson(deviceEquipmentId);
//						//PushBase base = new PushWeb(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
//						//base.pushPerson();
//					}
//					Integer apppush =messagePushSetEntity.getAppPushSwitchStatus();
//					if(apppush==1) {
//						pushApp.pushPerson(deviceEquipmentId);
////						PushBase base = new PushApp(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
////						base.pushPerson();
//					}
//					Integer smspush =messagePushSetEntity.getSmsPushSwitchStatus();//短信推送
//					if(smspush==1) {
//						pushSms.pushPerson(deviceEquipmentId);
////						PushBase base = new PushSms(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
////						base.pushPerson();
//					}
//					Integer telpush =messagePushSetEntity.getTelPushSwitchStatus(); //电话
//					if(telpush==1) {
//						pushTel.pushPerson(deviceEquipmentId);
////						PushBase base = new PushTel(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
////						base.pushPerson();
//					}
//					Integer salpush =messagePushSetEntity.getSalPushSwitchStatus();//声光报警
//					if(salpush==1) {
//						pushSal.pushPerson(deviceEquipmentId);
////						PushBase base = new PushSal(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
////						base.pushPerson();
//					}
//					Integer dmbpush =messagePushSetEntity.getDmbPushSwitchStatus();//智能广播
//					if(dmbpush==1) {
//						pushDmb.pushPerson(deviceEquipmentId);
////						PushBase base = new PushDmb(tcsmMessagePersonRecordService, tcsmMessagePushPersonService);
////						base.pushPerson();
//					}
//					
//				}
////				  TcsmDeviceRecordRequest req = new TcsmDeviceRecordRequest();
////				  req.setEntity(deviceRecordEntity);
//				//添加记录
//				tcsmDeviceRecordService.save(deviceRecordEntity);
//				
//				
//				
//				 Map<String, Object> usageMap = new HashMap<String, Object>();
//				 usageMap.put("EQ_deviceEquipmentId", deviceEquipmentId);
//	             QueryParams<TcsmDeviceUsageEntity> usageParam = new QueryParams<TcsmDeviceUsageEntity>( usageMap);
//	             
//	             List<TcsmDeviceUsageEntity> usagelist = tcsmDeviceUsageService.queryAll(usageParam);
//				//Integer tcsmDeviceUsageService.getTotalCount(usageMap);
//	            for (int i = 0; i < usagelist.size(); i++) {
//	            	TcsmDeviceUsageEntity usage = usagelist.get(i);
//	            	TcsmDeviceAlarmEntity alarmEntity = new TcsmDeviceAlarmEntity();
//					alarmEntity.setDeviceAlarmTime(new Date());
//					alarmEntity.setDeviceEquipmentId(deviceEquipmentId);
//					alarmEntity.setDeviceUsageId(usage.getId());
//					alarmEntity.setDeviceUsagePhone(usage.getDeviceUsagePhone());
//					alarmEntity.setDeviceUsagePerson(usage.getDeviceUsagePerson());
//					alarmEntity.setDeviceUsagePosition(usage.getDeviceUsagePosition());
//					alarmEntity.setDeviceManageId(usage.getDeviceManageId());
//					tcsmDeviceAlarmService.save(alarmEntity);
//				}
//			
//				
//              } 
//              
//
//		} else {
//			System.out.println("接口异常：" + msg);
//		}
//	}
//	 
//}
