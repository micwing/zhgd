/**
 * Description: 智慧工地-塔机监测系统-消息群发记录管理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:42
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupRecordListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupRecordRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupRecordListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupRecordResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessageGroupRecord;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监测系统-消息群发记录管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessageGroupRecord")
public class TcsmMessageGroupRecordImpl implements ITcsmMessageGroupRecord {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmMessageGroupRecordImpl.class);

    /**
     * 智慧工地-塔机监测系统-消息群发记录管理服务对象
     */
    @Autowired
    ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService;

    /**
     * 智慧工地-塔机监测系统-消息群发记录管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发记录管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息群发记录管理列表查询响应
     */
    public TcsmMessageGroupRecordListResponse getTcsmMessageGroupRecordList(TcsmMessageGroupRecordListRequest request){
        TcsmMessageGroupRecordListResponse response = new TcsmMessageGroupRecordListResponse();
        try {
            QueryParams<TcsmMessageGroupRecordEntity> queryParams = new QueryParams<TcsmMessageGroupRecordEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecords = tcsmMessageGroupRecordService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmMessageGroupRecords);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发记录管理请求
     * @return 保存智慧工地-塔机监测系统-消息群发记录管理响应
     */
    public TcsmMessageGroupRecordResponse addTcsmMessageGroupRecord(TcsmMessageGroupRecordRequest request){
        TcsmMessageGroupRecordResponse response = new TcsmMessageGroupRecordResponse();
        try {
            TcsmMessageGroupRecordEntity entity = request.getEntity();
            tcsmMessageGroupRecordService.save(entity);
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
     * 删除智慧工地-塔机监测系统-消息群发记录管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息群发记录管理响应
     */
    public TcsmMessageGroupRecordResponse deleteTcsmMessageGroupRecordById(Long id){
        TcsmMessageGroupRecordResponse response = new TcsmMessageGroupRecordResponse();
        try {
            tcsmMessageGroupRecordService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息群发记录管理请求
     * @return 修改智慧工地-塔机监测系统-消息群发记录管理响应
     */
    public TcsmMessageGroupRecordResponse updateTcsmMessageGroupRecord(TcsmMessageGroupRecordRequest request){
        TcsmMessageGroupRecordResponse response = new TcsmMessageGroupRecordResponse();
        try {
            tcsmMessageGroupRecordService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息群发记录管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息群发记录管理响应
     */
    public TcsmMessageGroupRecordResponse getTcsmMessageGroupRecordById(Long id){
        TcsmMessageGroupRecordResponse response = new TcsmMessageGroupRecordResponse();
        try {
            TcsmMessageGroupRecordEntity entity = tcsmMessageGroupRecordService.getById(id);
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
