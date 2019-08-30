/**
 * Description: 智慧工地-塔机监控系统-司机信息WS接口
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDriverInfoEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDriverInfoService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDriverInfoListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmDriverInfoRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDriverInfoListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmDriverInfoResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmDriverInfo;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监控系统-司机信息WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmDriverInfo")
public class TcsmDriverInfoImpl implements ITcsmDriverInfo {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmDriverInfoImpl.class);

    /**
     * 智慧工地-塔机监控系统-司机信息服务对象
     */
    @Autowired
    ITcsmDriverInfoService<TcsmDriverInfoEntity> tcsmDriverInfoService;

    /**
     * 智慧工地-塔机监控系统-司机信息列表查询
     * 
     * @param request
     *            智慧工地-塔机监控系统-司机信息列表查询请求
     * @return 智慧工地-塔机监控系统-司机信息列表查询响应
     */
    public TcsmDriverInfoListResponse getTcsmDriverInfoList(TcsmDriverInfoListRequest request){
        TcsmDriverInfoListResponse response = new TcsmDriverInfoListResponse();
        try {
            QueryParams<TcsmDriverInfoEntity> queryParams = new QueryParams<TcsmDriverInfoEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmDriverInfoEntity> tcsmDriverInfos = tcsmDriverInfoService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmDriverInfos);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监控系统-司机信息
     * 
     * @param request
     *            智慧工地-塔机监控系统-司机信息请求
     * @return 保存智慧工地-塔机监控系统-司机信息响应
     */
    public TcsmDriverInfoResponse addTcsmDriverInfo(TcsmDriverInfoRequest request){
        TcsmDriverInfoResponse response = new TcsmDriverInfoResponse();
        try {
            TcsmDriverInfoEntity entity = request.getEntity();
            tcsmDriverInfoService.save(entity);
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
     * 删除智慧工地-塔机监控系统-司机信息通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监控系统-司机信息响应
     */
    public TcsmDriverInfoResponse deleteTcsmDriverInfoById(Long id){
        TcsmDriverInfoResponse response = new TcsmDriverInfoResponse();
        try {
            tcsmDriverInfoService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监控系统-司机信息
     * 
     * @param request
     *            修改智慧工地-塔机监控系统-司机信息请求
     * @return 修改智慧工地-塔机监控系统-司机信息响应
     */
    public TcsmDriverInfoResponse updateTcsmDriverInfo(TcsmDriverInfoRequest request){
        TcsmDriverInfoResponse response = new TcsmDriverInfoResponse();
        try {
            tcsmDriverInfoService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监控系统-司机信息
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监控系统-司机信息响应
     */
    public TcsmDriverInfoResponse getTcsmDriverInfoById(Long id){
        TcsmDriverInfoResponse response = new TcsmDriverInfoResponse();
        try {
            TcsmDriverInfoEntity entity = tcsmDriverInfoService.getById(id);
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
