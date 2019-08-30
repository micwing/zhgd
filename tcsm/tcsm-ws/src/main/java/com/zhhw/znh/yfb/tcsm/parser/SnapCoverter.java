package com.zhhw.znh.yfb.tcsm.parser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapCurrentEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapHeartbeatEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapParamEntity;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapCurrentDataBody;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapCurrentDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapHeartbeatDataBody;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapHeartbeatDto;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapParamDataBody;
import com.zhhw.znh.yfb.tcsm.ws.dto.SnapParamDto;

public class SnapCoverter {
	
	private static String[] alertTypeMap = new String[32];
	private static String[] powerStatuMap = new String[16];
	private static String[] sensorStatusMap = new String[16];
	static {
		alertTypeMap[0] = "风速报警";
		alertTypeMap[1] = "超重报警";
		alertTypeMap[2] = "碰撞报警";
		alertTypeMap[3] = "力矩报警";
		alertTypeMap[4] = "倾斜";
		alertTypeMap[5] = "";
		alertTypeMap[6] = "";
		alertTypeMap[7] = "";
		alertTypeMap[8] = "前碰撞";
		alertTypeMap[9] = "后碰撞";
		alertTypeMap[10] = "左碰撞";
		alertTypeMap[11] = "右碰撞";
		alertTypeMap[12] = "区域保护前";
		alertTypeMap[13] = "区域保护后";
		alertTypeMap[14] = "区域保护左";
		alertTypeMap[15] = "区域保护右";
		alertTypeMap[16] = "上限位";
		alertTypeMap[17] = "下限位";
		alertTypeMap[18] = "外限位";
		alertTypeMap[19] = "内限位";
		alertTypeMap[20] = "左限位";
		alertTypeMap[21] = "右限位";
		alertTypeMap[22] = "";
		alertTypeMap[23] = "";
		alertTypeMap[24] = "";
		alertTypeMap[25] = "";
		alertTypeMap[26] = "";
		alertTypeMap[27] = "";
		alertTypeMap[28] = "";
		alertTypeMap[29] = "";
		alertTypeMap[30] = "";
		alertTypeMap[31] = "";
		
		powerStatuMap[0] = "回转左限位";
		powerStatuMap[1] = "回转左减速";
		powerStatuMap[2] = "回转右限位";
		powerStatuMap[3] = "回转右减速";
		powerStatuMap[4] = "高度减速";
		powerStatuMap[5] = "高度上限位";
		powerStatuMap[6] = "高度下限位";
		powerStatuMap[7] = "高度换速";
		powerStatuMap[8] = "幅度预减速";
		powerStatuMap[9] = "幅度外限位";
		powerStatuMap[10] = "幅度内限位";
		powerStatuMap[11] = "幅度换速";
		powerStatuMap[12] = "风速预警";
		powerStatuMap[13] = "风速报警";
		powerStatuMap[14] = "";
		powerStatuMap[15] = "锁定";
		
		sensorStatusMap[0] = "重量";
		sensorStatusMap[1] = "高度";
		sensorStatusMap[2] = "回转";
		sensorStatusMap[3] = "幅度";
		sensorStatusMap[4] = "风速";
		sensorStatusMap[5] = "倾角";
		sensorStatusMap[6] = "";
		sensorStatusMap[7] = "";
		sensorStatusMap[8] = "";
		sensorStatusMap[9] = "";
		sensorStatusMap[10] = "";
		sensorStatusMap[11] = "";
		sensorStatusMap[12] = "";
		sensorStatusMap[13] = "";
		sensorStatusMap[14] = "";
		sensorStatusMap[15] = "";
		
	}

	public static TcsmSnapParamEntity toNewEntity(SnapParamDto dto) {
		if (dto == null) {
			return null;
		}
		
		SnapParamDataBody body = dto.getData_body();
		TcsmSnapParamEntity e = new TcsmSnapParamEntity();
		e.setAbsturndirection(body.getAbsTurnDirection());
		e.setAbsturnpointvalue(body.getAbsTurnPointValue());
		e.setAbsturnvalue(body.getAbsTurnValue());
		e.setAcceptcompany(dto.getAcceptcompany());
		e.setAcreductionvalue(body.getAcReductionValue());
		e.setAcrestrictvalue(body.getAcRestrictValue());
		e.setAmpreductionvalue(body.getAmpReductionValue());
		e.setAmprestrictvalue(body.getAmpRestrictValue());
		e.setAnticollisionx(body.getAntiCollisionX());
		e.setAnticollisiony(body.getAntiCollisionY());
		e.setAppType(dto.getApp_type());
		e.setAreareductionvalue(body.getAreaReductionValue());
		e.setArearestrictvalue(body.getAreaRestrictValue());
		
		e.setBalancearmlenght(body.getBalanceArmLenght());
		e.setCraneno(body.getCraneno());
		e.setCreateTime(new Date());
//		e.setCreateTimeStr(createTime);
		e.setCuttorque(body.getCutTorque());
		e.setCutweight(body.getCutWeight());
		
		e.setDay(body.getDay());
		e.setEmptyhookad(body.getEmptyhookAD());
		e.setFarmarweight(body.getFarmarWeight());
		e.setHighreductionvalue(body.getHighReductionValue());
		e.setHighrestrictvalue(body.getHighRestrictValue());
		e.setHour(body.getHour());
		
//		e.setId(arg0);
		e.setLiftweight2ratio(body.getLiftWeight2Ratio());
		e.setLiftweight4ratio(body.getLiftWeight4Ratio());
		e.setLiftweightarmlenght(body.getLiftWeightArmLenght());
		e.setLiftweightrange4r(body.getLiftWeightRange4R());
		e.setLoadweightad(body.getLoadWeightAD());
		e.setMaxamplitude(body.getMaxAmplitude());
		e.setMaxamplitudead(body.getMaxAmplitudeAD());
		e.setMaxhighad(body.getMaxHighAD());
		e.setMaxrange2ratio(body.getMaxRange2Ratio());
		e.setMaxrange4ratio(body.getMaxRange4Ratio());
		e.setMaxrangeweight2r(body.getMaxRangeWeight2R());
		e.setMaxrangeweight4r(body.getMaxRangeWeight4R());
		e.setMaxweightrange2r(body.getMaxWeightRange2R());
		e.setMinamplitude(body.getMinAmplitude());
		e.setMinamplitudead(body.getMinAmplitudeAD());
		e.setMinhighad(body.getMinHighAD());
		e.setMinute(body.getMinute());
		e.setMouth(body.getMouth());
		
		e.setOperationType(dto.getOperation_type());
		e.setPotleftlimitad(body.getPotLeftLimitAD());
		e.setPotlimitangle(body.getPotLimitAngle());
		e.setPotrightlimitad(body.getPotRightLimitAD());
		
		e.setRatio(body.getRatio());
		e.setRotarytype(body.getRotaryType());
		
		e.setSecond(body.getSecond());
		e.setSendcompany(dto.getSendcompany());
		e.setSoftversion(body.getSoftVersion());
		e.setStandardscale(body.getStandardScale());
		e.setThrowovertorque(body.getThrowOverTorque());
		e.setThrowoverweight(body.getThrowOverWeight());
		e.setToweratheight(body.getTowerAtHeight());
		e.setTowerheight(body.getTowerHeight());
		e.setTurnreducionvalue(body.getTurnReducionValue());
		e.setTurnrestrictvalue(body.getTurnRestrictValue());
		e.setYear(body.getYear());
		e.setZigbeechannelno(body.getZigbeeChannelNo());
		e.setZigbeegroupno(body.getZigbeeGroupNo());
		e.setZigbeelocalno(body.getZigbeeLocalNo());
		
		return e;
	}
	
	public static TcsmSnapHeartbeatEntity toNewEntity(SnapHeartbeatDto dto) {
		if (dto == null) {
			return null;
		}
		
		SnapHeartbeatDataBody body = dto.getData_body();
		TcsmSnapHeartbeatEntity e = new TcsmSnapHeartbeatEntity();
		e.setAcceptcompany(dto.getAcceptcompany());
		e.setAppType(dto.getApp_type());
		e.setCreateTime(new Date());
//		e.setCreateTimeStr(createTime);
//		e.setId(null);
		e.setOnlinetime(body.getOnlinetime());
		e.setOperationType(dto.getOperation_type());
		e.setSendcompany(dto.getSendcompany());
		e.setSn(body.getSn());
		return e;
	}
	
	public static TcsmSnapCurrentEntity toNewEntity(SnapCurrentDto dto) {
		if (dto == null) {
			return null;
		}
		
		SnapCurrentDataBody body = dto.getData_body();
		
		TcsmSnapCurrentEntity e = new TcsmSnapCurrentEntity();
		e.setAcceptcompany(dto.getAcceptcompany());
		e.setAlertflag(body.getAlertFlag());
		e.setAlertflagDesc(StringUtils.join(getAlertTypeDesc(body.getAlertFlag()), ","));
		e.setAmplitude(body.getAmplitude());
		e.setAnglex(body.getAngleX());
		e.setAngley(body.getAngleY());
		e.setAppType(dto.getApp_type());
		e.setCard(body.getCard());
		e.setCraneno(body.getCraneno());
		e.setCreateTime(new Date());
//		e.setCreateTimeStr(createTime);
		e.setCurrentrate(body.getCurrentRate());
		e.setDay(body.getDay());
		e.setGeocoordinatex(body.getGeoCoordinateX());
		e.setGeocoordinatey(body.getGeoCoordinateY());
		e.setHeavy(body.getHeavy());
		e.setHeight(body.getHeight());
		e.setHour(body.getHour());
//		e.setId(arg0);
		e.setMinute(body.getMinute());
		e.setMouth(body.getMouth());
		e.setOperationType(dto.getOperation_type());
		e.setPowerstatu(body.getPowerStatu());
		e.setPowerstatuDesc(StringUtils.join(getPowerstatuDesc(body.getPowerStatu()), ","));
		e.setReserve(body.getReserve());
		e.setRotary(body.getRotary());
		e.setSafetorque(body.getSafetorque());
		e.setSafeweight(body.getSafeWeight());
		e.setSecond(body.getSecond());
		e.setSendcompany(dto.getSendcompany());
		e.setSensorstatus(body.getSensorStatus());
		e.setSensorstatusDesc(StringUtils.join(getSensorStatusDesc(body.getSensorStatus()), ","));
		e.setWarntype(body.getWarnType());
		e.setWarntypeDesc(StringUtils.join(getAlertTypeDesc(body.getWarnType()), ","));
		e.setWindspeed(body.getWindSpeed());
		e.setYear(body.getYear());
		return e;
	}
	
	public static List<String> getSensorStatusDesc(String sensorStatus) {
		if (sensorStatus == null) {
			return new ArrayList<String>(0);
		}
		sensorStatus = sensorStatus.trim();
		
		if (sensorStatus.length() != sensorStatusMap.length)  {
			sensorStatus = StringUtils.leftPad(sensorStatus, sensorStatusMap.length, "0");
//			throw new SnapParserErrorException("sensorStatus长度不合法，内容是："+sensorStatus);
		}
		
		List<String> lst = new ArrayList<String>();
		int len = sensorStatusMap.length;
		for (int i = 0; i < sensorStatus.length(); i++) {
			if(sensorStatus.charAt(i)=='1') {
				String desc = sensorStatusMap[len-1-i];
				if (StringUtils.isEmpty(desc)) {
					continue;
				}
				lst.add(desc);
			}
		}
		return lst;
	}
	
	public static List<String> getPowerstatuDesc(String powerstatu) {
		if (powerstatu == null) {
			return new ArrayList<String>(0);
		}
		powerstatu = powerstatu.trim();
		
		if (powerstatu.length() != powerStatuMap.length)  {
			powerstatu = StringUtils.leftPad(powerstatu, powerStatuMap.length, "0");
//			throw new SnapParserErrorException("powerstatu长度不合法，内容是："+powerstatu);
		}
		
		List<String> lst = new ArrayList<String>();
		int len = powerStatuMap.length;
		for (int i = 0; i < powerstatu.length(); i++) {
			if(powerstatu.charAt(i)=='1') {
				String desc = powerStatuMap[len-1-i];
				if (StringUtils.isEmpty(desc)) {
					continue;
				}
				lst.add(desc);
//				lst.add(powerStatuMap[len-1-i]);
			}
		}
		return lst;
	}
	
	public static List<String> getAlertTypeDesc(String alertType) {
		if (alertType == null) {
			return new ArrayList<String>(0);
		}
		alertType = alertType.trim();
		
		if (alertType.length() != alertTypeMap.length) {
			alertType = StringUtils.leftPad(alertType, alertTypeMap.length, "0");
//			throw new SnapParserErrorException("alertType长度不合法，内容是："+alertType);
		}
		
		List<String> lst = new ArrayList<String>();
		int len = alertTypeMap.length;
		for (int i = 0; i < alertType.length(); i++) {
			if(alertType.charAt(i)=='1') {
				String desc = alertTypeMap[len-1-i];
				if (StringUtils.isEmpty(desc)) {
					continue;
				}
				lst.add(desc);
//				lst.add(alertTypeMap[len-1-i]);
			}
		}
		return lst;
	}
}
