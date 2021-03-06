/**
 * Description: 智慧工地-塔机监控系统-设备上报参数日志WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:45
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapParamEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmSnapParamService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapParamListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapParamRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapParamListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapParamResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmSnapParam;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监控系统-设备上报参数日志WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmSnapParam")
public class TcsmSnapParamImpl implements ITcsmSnapParam {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmSnapParamImpl.class);

    /**
     * 智慧工地-塔机监控系统-设备上报参数日志服务对象
     */
    @Autowired
    ITcsmSnapParamService<TcsmSnapParamEntity> tcsmSnapParamService;

    /**
     * 智慧工地-塔机监控系统-设备上报参数日志列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备上报参数日志列表查询请求
     * @return 智慧工地-塔机监控系统-设备上报参数日志列表查询响应
     */
    public TcsmSnapParamListResponse getTcsmSnapParamList(TcsmSnapParamListRequest request){
        TcsmSnapParamListResponse response = new TcsmSnapParamListResponse();
        try {
            QueryParams<TcsmSnapParamEntity> queryParams = new QueryParams<TcsmSnapParamEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmSnapParamEntity> tcsmSnapParams = tcsmSnapParamService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmSnapParams);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-设备上报参数日志
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备上报参数日志请求
     * @return 保存智慧工地-塔机监控系统-设备上报参数日志响应
     */
    public TcsmSnapParamResponse addTcsmSnapParam(TcsmSnapParamRequest request){
        TcsmSnapParamResponse response = new TcsmSnapParamResponse();
        try {
            TcsmSnapParamEntity entity = request.getEntity();
            tcsmSnapParamService.save(entity);
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
     * 删除智慧工地-塔机监控系统-设备上报参数日志通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-设备上报参数日志响应
     */
    public TcsmSnapParamResponse deleteTcsmSnapParamById(Long id){
        TcsmSnapParamResponse response = new TcsmSnapParamResponse();
        try {
            tcsmSnapParamService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-设备上报参数日志
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-设备上报参数日志请求
     * @return 修改智慧工地-塔机监控系统-设备上报参数日志响应
     */
    public TcsmSnapParamResponse updateTcsmSnapParam(TcsmSnapParamRequest request){
        TcsmSnapParamResponse response = new TcsmSnapParamResponse();
        try {
            tcsmSnapParamService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-设备上报参数日志
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-设备上报参数日志响应
     */
    public TcsmSnapParamResponse getTcsmSnapParamById(Long id){
        TcsmSnapParamResponse response = new TcsmSnapParamResponse();
        try {
            TcsmSnapParamEntity entity = tcsmSnapParamService.getById(id);
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
