/**
 * Description: 智慧工地-塔机监控系统-设备司机关联WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:40
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-29   中核华纬   1.0         Initial
 */
package com.zhhw.znh.yfb.tcsm.ws.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceDriverRelEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceDriverRelService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceDriverRelListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceDriverRelRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceDriverRelListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceDriverRelResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceDriverRel;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监控系统-设备司机关联WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmDeviceDriverRel")
public class TcsmDeviceDriverRelImpl implements ITcsmDeviceDriverRel {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmDeviceDriverRelImpl.class);

    /**
     * 智慧工地-塔机监控系统-设备司机关联服务对象
     */
    @Autowired
    ITcsmDeviceDriverRelService<TcsmDeviceDriverRelEntity> tcsmDeviceDriverRelService;

    /**
     * 智慧工地-塔机监控系统-设备司机关联列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备司机关联列表查询请求
     * @return 智慧工地-塔机监控系统-设备司机关联列表查询响应
     */
    public TcsmDeviceDriverRelListResponse getTcsmDeviceDriverRelList(TcsmDeviceDriverRelListRequest request){
        TcsmDeviceDriverRelListResponse response = new TcsmDeviceDriverRelListResponse();
        try {
            QueryParams<TcsmDeviceDriverRelEntity> queryParams = new QueryParams<TcsmDeviceDriverRelEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmDeviceDriverRelEntity> tcsmDeviceDriverRels = tcsmDeviceDriverRelService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmDeviceDriverRels);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-设备司机关联
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备司机关联请求
     * @return 保存智慧工地-塔机监控系统-设备司机关联响应
     */
    public TcsmDeviceDriverRelResponse addTcsmDeviceDriverRel(TcsmDeviceDriverRelRequest request){
        TcsmDeviceDriverRelResponse response = new TcsmDeviceDriverRelResponse();
        try {
            TcsmDeviceDriverRelEntity entity = request.getEntity();
            tcsmDeviceDriverRelService.save(entity);
            response.setId(entity.getId());
			response.setEntity(entity);
            response.setResultCode(ReturnResult.CREATE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 删除智慧工地-塔机监控系统-设备司机关联通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-设备司机关联响应
     */
    public TcsmDeviceDriverRelResponse deleteTcsmDeviceDriverRelById(Long id){
        TcsmDeviceDriverRelResponse response = new TcsmDeviceDriverRelResponse();
        try {
            tcsmDeviceDriverRelService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-设备司机关联
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-设备司机关联请求
     * @return 修改智慧工地-塔机监控系统-设备司机关联响应
     */
    public TcsmDeviceDriverRelResponse updateTcsmDeviceDriverRel(TcsmDeviceDriverRelRequest request){
        TcsmDeviceDriverRelResponse response = new TcsmDeviceDriverRelResponse();
        try {
            tcsmDeviceDriverRelService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-设备司机关联
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-设备司机关联响应
     */
    public TcsmDeviceDriverRelResponse getTcsmDeviceDriverRelById(Long id){
        TcsmDeviceDriverRelResponse response = new TcsmDeviceDriverRelResponse();
        try {
            TcsmDeviceDriverRelEntity entity = tcsmDeviceDriverRelService.getById(id);
			if (null == entity) {
				response.setResultCode(ReturnResult.NOT_FOUND.getResultCode());
				response.setResultMessage(ReturnResult.NOT_FOUND.getResultMessage());
			} else {
				response.setEntity(entity);
				response.setResultCode(ReturnResult.SUCCESS.getResultCode());
			}
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }
}
