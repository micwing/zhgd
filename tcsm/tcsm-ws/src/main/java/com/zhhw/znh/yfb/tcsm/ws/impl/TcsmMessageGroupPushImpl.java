/**
 * Description: 智慧工地-塔机监测系统-消息群发管理WS接口
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

import org.apache.shiro.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupPushEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessageGroupRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupApp;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupDmb;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupSal;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupSms;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupTel;
import com.zhhw.znh.yfb.tcsm.pushgroup.PushGroupWeb;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupPushService;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessageGroupRecordService;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushPersonService;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessageGroupPush;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupPushListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessageGroupPushRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupPushListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessageGroupPushResponse;

/**
 * 智慧工地-塔机监测系统-消息群发管理WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessageGroupPush")
public class TcsmMessageGroupPushImpl implements ITcsmMessageGroupPush {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmMessageGroupPushImpl.class);

    /**
     * 智慧工地-塔机监测系统-消息群发管理服务对象
     */
    @Autowired
    ITcsmMessageGroupPushService<TcsmMessageGroupPushEntity> tcsmMessageGroupPushService;
    @Autowired
    ITcsmMessageGroupRecordService<TcsmMessageGroupRecordEntity> tcsmMessageGroupRecordService;
    
    @Autowired
    ITcsmMessagePushPersonService<TcsmMessagePushPersonEntity> tcsmMessagePushPersonService;

    /**
     * 智慧工地-塔机监测系统-消息群发管理列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发管理列表查询请求
     * @return 智慧工地-塔机监测系统-消息群发管理列表查询响应
     */
    public TcsmMessageGroupPushListResponse getTcsmMessageGroupPushList(TcsmMessageGroupPushListRequest request){
        TcsmMessageGroupPushListResponse response = new TcsmMessageGroupPushListResponse();
        try {
            QueryParams<TcsmMessageGroupPushEntity> queryParams = new QueryParams<TcsmMessageGroupPushEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmMessageGroupPushEntity> tcsmMessageGroupPushs = tcsmMessageGroupPushService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmMessageGroupPushs);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监测系统-消息群发管理
     * 
     * @param request
     *            智慧工地-塔机监测系统-消息群发管理请求
     * @return 保存智慧工地-塔机监测系统-消息群发管理响应
     */
    public TcsmMessageGroupPushResponse addTcsmMessageGroupPush(TcsmMessageGroupPushRequest request){
        TcsmMessageGroupPushResponse response = new TcsmMessageGroupPushResponse();
        try {
            TcsmMessageGroupPushEntity entity = request.getEntity();
            tcsmMessageGroupPushService.save(entity);
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
     * 删除智慧工地-塔机监测系统-消息群发管理通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-消息群发管理响应
     */
    public TcsmMessageGroupPushResponse deleteTcsmMessageGroupPushById(Long id){
        TcsmMessageGroupPushResponse response = new TcsmMessageGroupPushResponse();
        try {
            tcsmMessageGroupPushService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监测系统-消息群发管理
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-消息群发管理请求
     * @return 修改智慧工地-塔机监测系统-消息群发管理响应
     */
    public TcsmMessageGroupPushResponse updateTcsmMessageGroupPush(TcsmMessageGroupPushRequest request){
        TcsmMessageGroupPushResponse response = new TcsmMessageGroupPushResponse();
        try {
        	//更新推送配置
            tcsmMessageGroupPushService.update(request.getEntity());
            //发送消息
        	sendTcsmMessageGroupPush(request.getEntity());
        	
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }
    
    private void sendTcsmMessageGroupPush(TcsmMessageGroupPushEntity messageGroup){
    	if (messageGroup == null) {
    		return;
    	}
    	
    	//主开关
    	if (messageGroup.getMainSwitchStatus() == null || messageGroup.getMainSwitchStatus() != 1) {
    		return;
    	}
    	
        try {
        	Integer webpush =messageGroup.getWebPushSwitchStatus();
        	List<TcsmMessagePushPersonEntity> personList = tcsmMessagePushPersonService.queryAll();
        	
        	if (CollectionUtils.isEmpty(personList)) {
        		return;
        	}
        	
        	TcsmMessageGroupPushEntity set = tcsmMessageGroupPushService.getById(1L);
			if(webpush != null && 1==webpush) {
				new PushGroupWeb(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
			Integer apppush =messageGroup.getAppPushSwitchStatus();
			if(apppush != null && 1==apppush) {
				new PushGroupApp(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
			Integer smspush =messageGroup.getSmsPushSwitchStatus();//短信推送
			if(smspush != null && 1==smspush) {
				new PushGroupSms(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
			Integer telpush =messageGroup.getTelPushSwitchStatus(); //电话
			if(telpush!= null && 1==telpush) {
				new PushGroupTel(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
			Integer salpush =messageGroup.getSalPushSwitchStatus();//声光报警
			if(salpush != null && 1==salpush) {
				new PushGroupSal(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
			Integer dmbpush =messageGroup.getDmbPushSwitchStatus();//智能广播
			if(dmbpush != null && 1==dmbpush) {
				new PushGroupDmb(tcsmMessageGroupRecordService, personList, 
						set.getMessageGroupPushContent()).pushAll();
			}
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
    }

    /**
     * 通过ID获取智慧工地-塔机监测系统-消息群发管理
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-消息群发管理响应
     */
    public TcsmMessageGroupPushResponse getTcsmMessageGroupPushById(Long id){
        TcsmMessageGroupPushResponse response = new TcsmMessageGroupPushResponse();
        try {
            TcsmMessageGroupPushEntity entity = tcsmMessageGroupPushService.getById(id);
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
