/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import java.util.List;

import com.zhhw.znh.yfb.framework.tags.AbstractEnumSelectTag;
import com.zhhw.znh.yfb.tcsm.tags.beans.Manager;

/**
 * 管理员下拉列表
 * 
 * @author 杜辉
 *
 */
public class ManagerSelectTag extends AbstractEnumSelectTag<Manager> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String getDefaultName() {
        return "普通员工";
    }

    @Override
    protected List<Manager> getList() {
        return Manager.list();
    }
}
