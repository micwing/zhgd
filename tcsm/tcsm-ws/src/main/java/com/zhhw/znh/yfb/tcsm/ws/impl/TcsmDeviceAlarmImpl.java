/**
 * Description: 智慧工地-塔机监控系统-告警处理WS接口
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

import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceAlarmEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceAlarmService;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceAlarm;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceAlarmListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceAlarmRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceAlarmListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceAlarmResponse;

/**
 * 智慧工地-塔机监控系统-告警处理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmDeviceAlarm")
public class TcsmDeviceAlarmImpl implements ITcsmDeviceAlarm {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmDeviceAlarmImpl.class);

    /**
     * 智慧工地-塔机监控系统-告警处理服务对象
     */
    @Autowired
    ITcsmDeviceAlarmService<TcsmDeviceAlarmEntity> tcsmDeviceAlarmService;

    /**
     * 智慧工地-塔机监控系统-告警处理列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-告警处理列表查询请求
     * @return 智慧工地-塔机监控系统-告警处理列表查询响应
     */
    public TcsmDeviceAlarmListResponse getTcsmDeviceAlarmList(TcsmDeviceAlarmListRequest request){
        TcsmDeviceAlarmListResponse response = new TcsmDeviceAlarmListResponse();
        try {
            QueryParams<TcsmDeviceAlarmEntity> queryParams = new QueryParams<TcsmDeviceAlarmEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmDeviceAlarmEntity> tcsmDeviceAlarms = tcsmDeviceAlarmService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmDeviceAlarms);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-告警处理
     * 
     * @param request
     *            智慧工地-塔机监控系统-告警处理请求
     * @return 保存智慧工地-塔机监控系统-告警处理响应
     */
    public TcsmDeviceAlarmResponse addTcsmDeviceAlarm(TcsmDeviceAlarmRequest request){
        TcsmDeviceAlarmResponse response = new TcsmDeviceAlarmResponse();
        try {
            TcsmDeviceAlarmEntity entity = request.getEntity();
            tcsmDeviceAlarmService.save(entity);
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
     * 删除智慧工地-塔机监控系统-告警处理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-告警处理响应
     */
    public TcsmDeviceAlarmResponse deleteTcsmDeviceAlarmById(Long id){
        TcsmDeviceAlarmResponse response = new TcsmDeviceAlarmResponse();
        try {
            tcsmDeviceAlarmService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-告警处理
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-告警处理请求
     * @return 修改智慧工地-塔机监控系统-告警处理响应
     */
    public TcsmDeviceAlarmResponse updateTcsmDeviceAlarm(TcsmDeviceAlarmRequest request){
        TcsmDeviceAlarmResponse response = new TcsmDeviceAlarmResponse();
        try {
            tcsmDeviceAlarmService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-告警处理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-告警处理响应
     */
    public TcsmDeviceAlarmResponse getTcsmDeviceAlarmById(Long id){
        TcsmDeviceAlarmResponse response = new TcsmDeviceAlarmResponse();
        try {
            TcsmDeviceAlarmEntity entity = tcsmDeviceAlarmService.getById(id);
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
    
    @Override
    public int getTcsmDeviceRecordAlarmTotal(TcsmDeviceAlarmListRequest req) {
    	QueryParams<TcsmDeviceAlarmEntity> queryParams = new QueryParams<TcsmDeviceAlarmEntity>(
                req.getSearchParams());
        return tcsmDeviceAlarmService.getTotalCount(queryParams);
    }
}
