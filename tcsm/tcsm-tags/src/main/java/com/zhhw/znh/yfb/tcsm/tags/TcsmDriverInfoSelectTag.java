/**
 * 站点下拉列表
 */
package com.zhhw.znh.yfb.tcsm.tags;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhhw.znh.yfb.framework.tags.AbstractDomainObjectSelectTag;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDriverInfoEntity;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDriverInfo;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDriverInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDriverInfoListResponse;

public class TcsmDriverInfoSelectTag extends AbstractDomainObjectSelectTag<TcsmDriverInfoEntity> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long projectId;

    @Override
    protected String getDefaultName() {
        return "塔机司机";
    }

    @Override
    protected List<TcsmDriverInfoEntity> getList() {
        ITcsmDriverInfo sampleCompany = this.getApplicationContext().getBean(ITcsmDriverInfo.class);
        TcsmDriverInfoListRequest request = new TcsmDriverInfoListRequest();
        Map<String, Object> searchParams = new HashMap<String, Object>();
        if (projectId != null) {
            searchParams.put("EQ_projectId", projectId);
        }
        request.setSearchParams(searchParams);
        request.getPaging().setPageSize(Integer.MAX_VALUE);
        TcsmDriverInfoListResponse response = sampleCompany.getTcsmDriverInfoList(request);
        return response.getObjectList();
    }
    
    @Override
    protected String getOptionLabel(TcsmDriverInfoEntity obj) {
        return obj.getName();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

}
