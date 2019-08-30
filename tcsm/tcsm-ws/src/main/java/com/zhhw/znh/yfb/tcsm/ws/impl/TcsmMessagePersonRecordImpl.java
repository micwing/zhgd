/**
 * Description: 智慧工地-塔机监测系统-消息单人记录管理WS接口
 * Copyright:   Copyright (c)2019
 * Company:     中核华纬
 * @author:     中核华纬
 * @version:    1.0
 * Create at:   2019-07-29 下午 17:28:43
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePersonRecordListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePersonRecordRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePersonRecordListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePersonRecordResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePersonRecord;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监测系统-消息单人记录管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessagePersonRecord")
public class TcsmMessagePersonRecordImpl implements ITcsmMessagePersonRecord {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmMessagePersonRecordImpl.class);

    /**
     * 智慧工地-塔机监测系统-消息单人记录管理服务对象
     */
    @Autowired
    ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService;

    /**
     * 智慧工地-塔机监测系统-消息单人记录管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息单人记录管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息单人记录管理列表查询响应
     */
    public TcsmMessagePersonRecordListResponse getTcsmMessagePersonRecordList(TcsmMessagePersonRecordListRequest request){
        TcsmMessagePersonRecordListResponse response = new TcsmMessagePersonRecordListResponse();
        try {
            QueryParams<TcsmMessagePersonRecordEntity> queryParams = new QueryParams<TcsmMessagePersonRecordEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecords = tcsmMessagePersonRecordService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmMessagePersonRecords);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息单人记录管理请求
     * @return 保存智慧工地-塔机监测系统-消息单人记录管理响应
     */
    public TcsmMessagePersonRecordResponse addTcsmMessagePersonRecord(TcsmMessagePersonRecordRequest request){
        TcsmMessagePersonRecordResponse response = new TcsmMessagePersonRecordResponse();
        try {
            TcsmMessagePersonRecordEntity entity = request.getEntity();
            tcsmMessagePersonRecordService.save(entity);
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
     * 删除智慧工地-塔机监测系统-消息单人记录管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息单人记录管理响应
     */
    public TcsmMessagePersonRecordResponse deleteTcsmMessagePersonRecordById(Long id){
        TcsmMessagePersonRecordResponse response = new TcsmMessagePersonRecordResponse();
        try {
            tcsmMessagePersonRecordService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息单人记录管理请求
     * @return 修改智慧工地-塔机监测系统-消息单人记录管理响应
     */
    public TcsmMessagePersonRecordResponse updateTcsmMessagePersonRecord(TcsmMessagePersonRecordRequest request){
        TcsmMessagePersonRecordResponse response = new TcsmMessagePersonRecordResponse();
        try {
            tcsmMessagePersonRecordService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息单人记录管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息单人记录管理响应
     */
    public TcsmMessagePersonRecordResponse getTcsmMessagePersonRecordById(Long id){
        TcsmMessagePersonRecordResponse response = new TcsmMessagePersonRecordResponse();
        try {
            TcsmMessagePersonRecordEntity entity = tcsmMessagePersonRecordService.getById(id);
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
