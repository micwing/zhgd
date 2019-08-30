/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import com.zhhw.znh.yfb.framework.tags.AbstractViewTag;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceInfo;

public class TcsmDeviceInfoViewTag extends AbstractViewTag {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    {
        setValue(0L);
    }

    private Long tcsmId;

    private String tcsmName;

    @Override
    protected String getShowValue() {
    	if (tcsmId == null || tcsmId == 0) {
    		return "";
    	}
        ITcsmDeviceInfo TcsmDeviceInfo = this.getApplicationContext().getBean(ITcsmDeviceInfo.class);
        return TcsmDeviceInfo.getTcsmDeviceInfoById(tcsmId).getEntity().getDeviceName();
    }

	public Long getTcsmId() {
		return tcsmId;
	}

	public void setTcsmId(Long tcsmId) {
		this.tcsmId = tcsmId;
	}

	public String getTcsmName() {
		return tcsmName;
	}

	public void setTcsmName(String tcsmName) {
		this.tcsmName = tcsmName;
	}

}
