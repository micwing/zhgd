/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags;

import java.util.List;

import com.zhhw.znh.yfb.framework.tags.AbstractEnumSelectTag;
import com.zhhw.znh.yfb.tcsm.tags.beans.Gender;

/**
 * 性别下拉列表
 * 
 * @author 程建芳
 *
 */
public class GenderSelectTag extends AbstractEnumSelectTag<Gender> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String getDefaultName() {
        return "性别";
    }

    @Override
    protected List<Gender> getList() {
        return Gender.list();
    }
}
