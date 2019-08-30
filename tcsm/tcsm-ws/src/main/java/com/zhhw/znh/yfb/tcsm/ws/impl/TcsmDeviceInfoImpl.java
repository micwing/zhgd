/**
 * Description: 智慧工地-塔机监控系统-塔机设备WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:41
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceInfoService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDeviceInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDeviceInfoResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDeviceInfo;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监控系统-塔机设备WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmDeviceInfo")
public class TcsmDeviceInfoImpl implements ITcsmDeviceInfo {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmDeviceInfoImpl.class);

    /**
     * 智慧工地-塔机监控系统-塔机设备服务对象
     */
    @Autowired
    ITcsmDeviceInfoService<TcsmDeviceInfoEntity> tcsmDeviceInfoService;

    /**
     * 智慧工地-塔机监控系统-塔机设备列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-塔机设备列表查询请求
     * @return 智慧工地-塔机监控系统-塔机设备列表查询响应
     */
    public TcsmDeviceInfoListResponse getTcsmDeviceInfoList(TcsmDeviceInfoListRequest request){
        TcsmDeviceInfoListResponse response = new TcsmDeviceInfoListResponse();
        try {
            QueryParams<TcsmDeviceInfoEntity> queryParams = new QueryParams<TcsmDeviceInfoEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmDeviceInfoEntity> tcsmDeviceInfos = tcsmDeviceInfoService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmDeviceInfos);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-塔机设备
     * 
     * @param request
     *            智慧工地-塔机监控系统-塔机设备请求
     * @return 保存智慧工地-塔机监控系统-塔机设备响应
     */
    public TcsmDeviceInfoResponse addTcsmDeviceInfo(TcsmDeviceInfoRequest request){
        TcsmDeviceInfoResponse response = new TcsmDeviceInfoResponse();
        try {
            TcsmDeviceInfoEntity entity = request.getEntity();
            tcsmDeviceInfoService.save(entity);
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
     * 删除智慧工地-塔机监控系统-塔机设备通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-塔机设备响应
     */
    public TcsmDeviceInfoResponse deleteTcsmDeviceInfoById(Long id){
        TcsmDeviceInfoResponse response = new TcsmDeviceInfoResponse();
        try {
            tcsmDeviceInfoService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-塔机设备
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-塔机设备请求
     * @return 修改智慧工地-塔机监控系统-塔机设备响应
     */
    public TcsmDeviceInfoResponse updateTcsmDeviceInfo(TcsmDeviceInfoRequest request){
        TcsmDeviceInfoResponse response = new TcsmDeviceInfoResponse();
        try {
            tcsmDeviceInfoService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-塔机设备
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-塔机设备响应
     */
    public TcsmDeviceInfoResponse getTcsmDeviceInfoById(Long id){
        TcsmDeviceInfoResponse response = new TcsmDeviceInfoResponse();
        try {
            TcsmDeviceInfoEntity entity = tcsmDeviceInfoService.getById(id);
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
