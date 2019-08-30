/**
 * 站点下拉列表
 */
package com.zhhw.znh.yfb.tcsm.tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhhw.znh.yfb.framework.tags.AbstractDomainObjectSelectTag;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceInfo;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceInfoListResponse;

public class TcsmDeviceInfoSelectTag extends AbstractDomainObjectSelectTag<TcsmDeviceInfoEntity> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long projectId;

    @Override
    protected String getDefaultName() {
        return "塔吊设备";
    }

    @Override
    protected List<TcsmDeviceInfoEntity> getList() {
        ITcsmDeviceInfo sampleCompany = this.getApplicationContext().getBean(ITcsmDeviceInfo.class);
        TcsmDeviceInfoListRequest request = new TcsmDeviceInfoListRequest();
        Map<String, Object> searchParams = new HashMap<String, Object>();
        if (projectId != null) {
            searchParams.put("EQ_projectId", projectId);
        }
        request.setSearchParams(searchParams);
        request.getPaging().setPageSize(Integer.MAX_VALUE);
        TcsmDeviceInfoListResponse response = sampleCompany.getTcsmDeviceInfoList(request);
        return response.getObjectList();
    }

    @Override
    protected String getOptionLabel(TcsmDeviceInfoEntity obj) {
        return obj.getDeviceName();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

}
