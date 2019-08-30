package com.zhhw.znh.yfb.tcsm.ws.dto;

public class SnapHeartbeatDto implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	private String sendcompany;
	
	/**
	 * 接收方
	 */
	private String acceptcompany;
	
	/**
	 * 帧类型
	 */
	private String operation_type;
	
	/**
	 * 设备类型
	 */
	private String app_type;
	
	private SnapHeartbeatDataBody data_body;

	public String getSendcompany() {
		return sendcompany;
	}

	public void setSendcompany(String sendcompany) {
		this.sendcompany = sendcompany;
	}

	public String getAcceptcompany() {
		return acceptcompany;
	}

	public void setAcceptcompany(String acceptcompany) {
		this.acceptcompany = acceptcompany;
	}

	public String getOperation_type() {
		return operation_type;
	}

	public void setOperation_type(String operation_type) {
		this.operation_type = operation_type;
	}

	public String getApp_type() {
		return app_type;
	}

	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}

	public SnapHeartbeatDataBody getData_body() {
		return data_body;
	}

	public void setData_body(SnapHeartbeatDataBody data_body) {
		this.data_body = data_body;
	}
	
}
