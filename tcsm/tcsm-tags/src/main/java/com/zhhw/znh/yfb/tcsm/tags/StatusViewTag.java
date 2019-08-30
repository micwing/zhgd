/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import com.zhhw.znh.yfb.framework.tags.AbstractViewTag;
import com.zhhw.znh.yfb.tcsm.tags.beans.Status;

/**
 * @author 程建芳
 *
 */
public class StatusViewTag extends AbstractViewTag {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String getShowValue() {
        return Status.getById(value).getShowName();
    }

}
