/**
 * 
 */
package com.zhhw.znh.yfb.tcsm.tags.beans;

import java.util.ArrayList;
import java.util.List;

import com.zhhw.znh.yfb.framework.tags.IdNameAble;

/**
 * @author 杜辉
 *
 */
public enum Status implements IdNameAble {

    ENABLED(1L, "有效"), DISABLED(0L, "无效");

    /**
     * 唯一标识
     */
    private Long id;

    /**
     * 显示名称
     */
    private String showName;

    /**
     * 获取唯一标识
     * 
     * @return 唯一标识
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一标识
     * 
     * @param id 唯一标识
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取显示名称
     * 
     * @return 显示名称
     */
    @Override
    public String getShowName() {
        return showName;
    }

    /**
     * 设置显示名称
     * 
     * @param showName 显示名称
     */
    @Override
    public void setShowName(String showName) {
        this.showName = showName;
    }

    /**
     * 构造方法
     * 
     * @param id 唯一标识
     * @param showName 显示名称
     */
    private Status(Long id, String showName) {
        this.id = id;
        this.showName = showName;
    }

    /**
     * 获取枚举列表
     * 
     * @return 枚举列表
     */
    public static final List<Status> list() {
        return new ArrayList<Status>() {
            /**
             * 
             */
            private static final long serialVersionUID = 1L;

            {
                add(ENABLED);
                add(DISABLED);
            }
        };
    }

    /**
     * 通过ID查询枚举对象
     * 
     * @param id 唯一标识
     * @return 枚举对象
     */
    public static final Status getById(Long id) {
        for (Status importExportFlag : list()) {
            if (importExportFlag.id.equals(id)) {
                return importExportFlag;
            }
        }
        return null;
    }
}
