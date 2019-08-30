/**
 * Description: 智慧工地-塔机监测系统-报警消息推送用户WS接口
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

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushPersonService;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushPersonListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushPersonRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushPersonListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushPersonResponse;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePushPerson;
import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;

/**
 * 智慧工地-塔机监测系统-报警消息推送用户WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessagePushPerson")
public class TcsmMessagePushPersonImpl implements ITcsmMessagePushPerson {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmMessagePushPersonImpl.class);

    /**
     * 智慧工地-塔机监测系统-报警消息推送用户服务对象
     */
    @Autowired
    ITcsmMessagePushPersonService<TcsmMessagePushPersonEntity> tcsmMessagePushPersonService;

    /**
     * 智慧工地-塔机监测系统-报警消息推送用户列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警消息推送用户列表查询请求
     * @return 智慧工地-塔机监测系统-报警消息推送用户列表查询响应
     */
    public TcsmMessagePushPersonListResponse getTcsmMessagePushPersonList(TcsmMessagePushPersonListRequest request){
        TcsmMessagePushPersonListResponse response = new TcsmMessagePushPersonListResponse();
        try {
            QueryParams<TcsmMessagePushPersonEntity> queryParams = new QueryParams<TcsmMessagePushPersonEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmMessagePushPersonEntity> tcsmMessagePushPersons = tcsmMessagePushPersonService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmMessagePushPersons);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }
    
    public TcsmMessagePushPersonListResponse queryAll(){
        TcsmMessagePushPersonListResponse response = new TcsmMessagePushPersonListResponse();
        try {
            List<TcsmMessagePushPersonEntity> tcsmMessagePushPersons = tcsmMessagePushPersonService.queryAll();
            response.setObjectList(tcsmMessagePushPersons);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警消息推送用户请求
     * @return 保存智慧工地-塔机监测系统-报警消息推送用户响应
     */
    public TcsmMessagePushPersonResponse addTcsmMessagePushPerson(TcsmMessagePushPersonRequest request){
        TcsmMessagePushPersonResponse response = new TcsmMessagePushPersonResponse();
        try {
            TcsmMessagePushPersonEntity entity = request.getEntity();
            tcsmMessagePushPersonService.save(entity);
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
     * 删除智慧工地-塔机监测系统-报警消息推送用户通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-报警消息推送用户响应
     */
    public TcsmMessagePushPersonResponse deleteTcsmMessagePushPersonById(Long id){
        TcsmMessagePushPersonResponse response = new TcsmMessagePushPersonResponse();
        try {
            tcsmMessagePushPersonService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-报警消息推送用户请求
     * @return 修改智慧工地-塔机监测系统-报警消息推送用户响应
     */
    public TcsmMessagePushPersonResponse updateTcsmMessagePushPerson(TcsmMessagePushPersonRequest request){
        TcsmMessagePushPersonResponse response = new TcsmMessagePushPersonResponse();
        try {
            tcsmMessagePushPersonService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监测系统-报警消息推送用户
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-报警消息推送用户响应
     */
    public TcsmMessagePushPersonResponse getTcsmMessagePushPersonById(Long id){
        TcsmMessagePushPersonResponse response = new TcsmMessagePushPersonResponse();
        try {
            TcsmMessagePushPersonEntity entity = tcsmMessagePushPersonService.getById(id);
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
