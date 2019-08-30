/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import com.zhhw.znh.yfb.framework.tags.AbstractViewTag;
import com.zhhw.znh.yfb.tcsm.tags.beans.Manager;

/**
 * @author 杜辉
 *
 */
public class ManagerViewTag extends AbstractViewTag {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String getShowValue() {
        return Manager.getById(value).getShowName();
    }

}
