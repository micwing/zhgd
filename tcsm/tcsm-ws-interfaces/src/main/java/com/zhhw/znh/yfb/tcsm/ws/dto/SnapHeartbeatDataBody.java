package com.zhhw.znh.yfb.tcsm.ws.dto;

public class SnapHeartbeatDataBody implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String Sn;
	
	private String Onlinetime;

	public String getSn() {
		return Sn;
	}

	public void setSn(String sn) {
		Sn = sn;
	}

	public String getOnlinetime() {
		return Onlinetime;
	}

	public void setOnlinetime(String onlinetime) {
		Onlinetime = onlinetime;
	}

}
