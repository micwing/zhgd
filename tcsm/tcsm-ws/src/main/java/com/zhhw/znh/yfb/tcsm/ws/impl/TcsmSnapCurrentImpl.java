/**
 * Description: 智慧工地-塔机监控系统-设备实时数据日志WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:44
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmSnapCurrentEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmSnapCurrentService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapCurrentListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmSnapCurrentRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapCurrentListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmSnapCurrentResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmSnapCurrent;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监控系统-设备实时数据日志WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmSnapCurrent")
public class TcsmSnapCurrentImpl implements ITcsmSnapCurrent {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmSnapCurrentImpl.class);

    /**
     * 智慧工地-塔机监控系统-设备实时数据日志服务对象
     */
    @Autowired
    ITcsmSnapCurrentService<TcsmSnapCurrentEntity> tcsmSnapCurrentService;

    /**
     * 智慧工地-塔机监控系统-设备实时数据日志列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备实时数据日志列表查询请求
     * @return 智慧工地-塔机监控系统-设备实时数据日志列表查询响应
     */
    public TcsmSnapCurrentListResponse getTcsmSnapCurrentList(TcsmSnapCurrentListRequest request){
        TcsmSnapCurrentListResponse response = new TcsmSnapCurrentListResponse();
        try {
            QueryParams<TcsmSnapCurrentEntity> queryParams = new QueryParams<TcsmSnapCurrentEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmSnapCurrentEntity> tcsmSnapCurrents = tcsmSnapCurrentService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmSnapCurrents);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-设备实时数据日志
     * 
     * @param request
     *            智慧工地-塔机监控系统-设备实时数据日志请求
     * @return 保存智慧工地-塔机监控系统-设备实时数据日志响应
     */
    public TcsmSnapCurrentResponse addTcsmSnapCurrent(TcsmSnapCurrentRequest request){
        TcsmSnapCurrentResponse response = new TcsmSnapCurrentResponse();
        try {
            TcsmSnapCurrentEntity entity = request.getEntity();
            tcsmSnapCurrentService.save(entity);
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
     * 删除智慧工地-塔机监控系统-设备实时数据日志通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-设备实时数据日志响应
     */
    public TcsmSnapCurrentResponse deleteTcsmSnapCurrentById(Long id){
        TcsmSnapCurrentResponse response = new TcsmSnapCurrentResponse();
        try {
            tcsmSnapCurrentService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-设备实时数据日志
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-设备实时数据日志请求
     * @return 修改智慧工地-塔机监控系统-设备实时数据日志响应
     */
    public TcsmSnapCurrentResponse updateTcsmSnapCurrent(TcsmSnapCurrentRequest request){
        TcsmSnapCurrentResponse response = new TcsmSnapCurrentResponse();
        try {
            tcsmSnapCurrentService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-设备实时数据日志
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-设备实时数据日志响应
     */
    public TcsmSnapCurrentResponse getTcsmSnapCurrentById(Long id){
        TcsmSnapCurrentResponse response = new TcsmSnapCurrentResponse();
        try {
            TcsmSnapCurrentEntity entity = tcsmSnapCurrentService.getById(id);
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
