package com.zhhw.znh.yfb.tcsm.ws.dto;

public class SnapCurrentDataBody implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 设备编号
	 */
	private String Craneno;
	
	/**
	 * 司机卡号
	 */
	private String Card;
	
	/**
	 * 日期(年)
	 */
	private String Year;
	
	/**
	 * 日期(月)
	 */
	private String Mouth;
	
	/**
	 * 日期(日)
	 */
	private String Day;
	
	/**
	 * 日期(小时)
	 */
	private String Hour;
	
	/**
	 * 日期(分钟)
	 */
	private String Minute;
	
	/**
	 * 日期(秒)
	 */
	private String Second;
	
	/**
	 * 经度
	 */
	private String GeoCoordinateY;
	
	/**
	 * 纬度
	 */
	private String GeoCoordinateX;
	
	/**
	 * 高度
	 */
	private String Height;
	
	/**
	 * 幅度
	 */
	private String Amplitude;
	
	/**
	 * 回转
	 */
	private String Rotary;
	
	/**
	 * 重量
	 */
	private String Heavy;
	
	/**
	 * 风速
	 */
	private String WindSpeed;
	
	/**
	 * 倾角 X
	 */
	private String AngleX;
	
	/**
	 * 倾角 Y
	 */
	private String AngleY;
	
	/**
	 * 额定力矩
	 */
	private String Safetorque;
	
	/**
	 * 安全起重量
	 */
	private String SafeWeight;
	
	/**
	 * 倍率
	 */
	private String CurrentRate;
	
	/**
	 * 预留
	 */
	private String Reserve;
	
	/**
	 * 控制状态
	 */
	private String PowerStatu;
	
	/**
	 * 传感器状态
	 */
	private String SensorStatus;
	
	/**
	 * 预警告码
	 */
	private String WarnType;
	
	/**
	 * 报警告码
	 */
	private String AlertFlag;

	public String getCraneno() {
		return Craneno;
	}

	public void setCraneno(String craneno) {
		Craneno = craneno;
	}

	public String getCard() {
		return Card;
	}

	public void setCard(String card) {
		Card = card;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getMouth() {
		return Mouth;
	}

	public void setMouth(String mouth) {
		Mouth = mouth;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public String getHour() {
		return Hour;
	}

	public void setHour(String hour) {
		Hour = hour;
	}

	public String getMinute() {
		return Minute;
	}

	public void setMinute(String minute) {
		Minute = minute;
	}

	public String getSecond() {
		return Second;
	}

	public void setSecond(String second) {
		Second = second;
	}

	public String getGeoCoordinateY() {
		return GeoCoordinateY;
	}

	public void setGeoCoordinateY(String geoCoordinateY) {
		GeoCoordinateY = geoCoordinateY;
	}

	public String getGeoCoordinateX() {
		return GeoCoordinateX;
	}

	public void setGeoCoordinateX(String geoCoordinateX) {
		GeoCoordinateX = geoCoordinateX;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}

	public String getAmplitude() {
		return Amplitude;
	}

	public void setAmplitude(String amplitude) {
		Amplitude = amplitude;
	}

	public String getRotary() {
		return Rotary;
	}

	public void setRotary(String rotary) {
		Rotary = rotary;
	}

	public String getHeavy() {
		return Heavy;
	}

	public void setHeavy(String heavy) {
		Heavy = heavy;
	}

	public String getWindSpeed() {
		return WindSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		WindSpeed = windSpeed;
	}

	public String getAngleX() {
		return AngleX;
	}

	public void setAngleX(String angleX) {
		AngleX = angleX;
	}

	public String getAngleY() {
		return AngleY;
	}

	public void setAngleY(String angleY) {
		AngleY = angleY;
	}

	public String getSafetorque() {
		return Safetorque;
	}

	public void setSafetorque(String safetorque) {
		Safetorque = safetorque;
	}

	public String getSafeWeight() {
		return SafeWeight;
	}

	public void setSafeWeight(String safeWeight) {
		SafeWeight = safeWeight;
	}

	public String getCurrentRate() {
		return CurrentRate;
	}

	public void setCurrentRate(String currentRate) {
		CurrentRate = currentRate;
	}

	public String getReserve() {
		return Reserve;
	}

	public void setReserve(String reserve) {
		Reserve = reserve;
	}

	public String getPowerStatu() {
		return PowerStatu;
	}

	public void setPowerStatu(String powerStatu) {
		PowerStatu = powerStatu;
	}

	public String getSensorStatus() {
		return SensorStatus;
	}

	public void setSensorStatus(String sensorStatus) {
		SensorStatus = sensorStatus;
	}

	public String getWarnType() {
		return WarnType;
	}

	public void setWarnType(String warnType) {
		WarnType = warnType;
	}

	public String getAlertFlag() {
		return AlertFlag;
	}

	public void setAlertFlag(String alertFlag) {
		AlertFlag = alertFlag;
	}
	
}
