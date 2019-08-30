/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import java.util.List;

import com.zhhw.znh.yfb.framework.tags.AbstractEnumSelectTag;
import com.zhhw.znh.yfb.tcsm.tags.beans.Status;

/**
 * 状态下拉列表
 * 
 * @author 杜辉
 *
 */
public class StatusSelectTag extends AbstractEnumSelectTag<Status> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String getDefaultName() {
        return "状态";
    }

    @Override
    protected List<Status> getList() {
        return Status.list();
    }
}
