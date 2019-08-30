/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import com.zhhw.znh.yfb.framework.tags.AbstractViewTag;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDriverInfo;

public class TcsmDriverInfoViewTag extends AbstractViewTag {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    {
        setValue(0L);
    }

    private Long driverId;
    
    private String driverName;

    @Override
    protected String getShowValue() {
    	if (driverId == null || driverId == 0) {
    		return "";
    	}
        ITcsmDriverInfo TcsmDriverInfo = this.getApplicationContext().getBean(ITcsmDriverInfo.class);
        return TcsmDriverInfo.getTcsmDriverInfoById(driverId).getEntity().getName();
    }

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
