/**
 * Description: 智慧工地-吊钩可视化系统-监控设备管理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-24 上午 09:07:44
 *  
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2019-07-24   中核华纬   1.0         Initial
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
import com.zhhw.znh.yfb.tcsm.beans.entity.TcvrDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcvrDeviceInfoService;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcvrDeviceInfo;
import com.zhhw.znh.yfb.tcsm.ws.request.TcvrDeviceInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcvrDeviceInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcvrDeviceInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcvrDeviceInfoResponse;

/**
 * 智慧工地-吊钩可视化系统-监控设备管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-24
 * @see
 * @since 1.0
 */
@Service("tcvrDeviceInfo")
public class TcvrDeviceInfoImpl implements ITcvrDeviceInfo {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcvrDeviceInfoImpl.class);

    /**
     * 智慧工地-吊钩可视化系统-监控设备管理服务对象
     */
    @Autowired
    ITcvrDeviceInfoService<TcvrDeviceInfoEntity> tcvrDeviceInfoService;

    /**
     * 智慧工地-吊钩可视化系统-监控设备管理列表查询
     * 
     * @param request
     *            智慧工地-吊钩可视化系统-监控设备管理列表查询请求
     * @return 智慧工地-吊钩可视化系统-监控设备管理列表查询响应
     */
    public TcvrDeviceInfoListResponse getTcvrDeviceInfoList(TcvrDeviceInfoListRequest request){
        TcvrDeviceInfoListResponse response = new TcvrDeviceInfoListResponse();
        try {
            QueryParams<TcvrDeviceInfoEntity> queryParams = new QueryParams<TcvrDeviceInfoEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcvrDeviceInfoEntity> tcvrDeviceInfos = tcvrDeviceInfoService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcvrDeviceInfos);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param request
     *            智慧工地-吊钩可视化系统-监控设备管理请求
     * @return 保存智慧工地-吊钩可视化系统-监控设备管理响应
     */
    public TcvrDeviceInfoResponse addTcvrDeviceInfo(TcvrDeviceInfoRequest request){
        TcvrDeviceInfoResponse response = new TcvrDeviceInfoResponse();
        try {
            TcvrDeviceInfoEntity entity = request.getEntity();
            tcvrDeviceInfoService.save(entity);
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
     * 删除智慧工地-吊钩可视化系统-监控设备管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-吊钩可视化系统-监控设备管理响应
     */
    public TcvrDeviceInfoResponse deleteTcvrDeviceInfoById(Long id){
        TcvrDeviceInfoResponse response = new TcvrDeviceInfoResponse();
        try {
            tcvrDeviceInfoService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param request
     *            修改智慧工地-吊钩可视化系统-监控设备管理请求
     * @return 修改智慧工地-吊钩可视化系统-监控设备管理响应
     */
    public TcvrDeviceInfoResponse updateTcvrDeviceInfo(TcvrDeviceInfoRequest request){
        TcvrDeviceInfoResponse response = new TcvrDeviceInfoResponse();
        try {
            tcvrDeviceInfoService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-吊钩可视化系统-监控设备管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-吊钩可视化系统-监控设备管理响应
     */
    public TcvrDeviceInfoResponse getTcvrDeviceInfoById(Long id){
        TcvrDeviceInfoResponse response = new TcvrDeviceInfoResponse();
        try {
            TcvrDeviceInfoEntity entity = tcvrDeviceInfoService.getById(id);
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
