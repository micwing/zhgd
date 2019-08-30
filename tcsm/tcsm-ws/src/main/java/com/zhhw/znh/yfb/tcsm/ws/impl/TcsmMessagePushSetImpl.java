/**
 * Description: 智慧工地-塔机监测系统-报警推送设置WS接口
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

import org.apache.shiro.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhhw.znh.yfb.framework.ws.beans.Page;
import com.zhhw.znh.yfb.framework.ws.beans.QueryParams;
import com.zhhw.znh.yfb.framework.ws.beans.ReturnResult;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePersonRecordEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushPersonEntity;
import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmMessagePushSetEntity;
import com.zhhw.znh.yfb.tcsm.push.PushApp;
import com.zhhw.znh.yfb.tcsm.push.PushDmb;
import com.zhhw.znh.yfb.tcsm.push.PushSal;
import com.zhhw.znh.yfb.tcsm.push.PushSms;
import com.zhhw.znh.yfb.tcsm.push.PushTel;
import com.zhhw.znh.yfb.tcsm.push.PushWeb;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePersonRecordService;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmMessagePushSetService;
import com.zhhw.znh.yfb.tcsm.ws.interfaces.ITcsmMessagePushSet;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushSetListRequest;
import com.zhhw.znh.yfb.tcsm.ws.request.TcsmMessagePushSetRequest;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushSetListResponse;
import com.zhhw.znh.yfb.tcsm.ws.response.TcsmMessagePushSetResponse;

/**
 * 智慧工地-塔机监测系统-报警推送设置WS接口<br>
 * 
 * @author 中核华纬
 * @version 1.0, 2019-07-29
 * @see
 * @since 1.0
 */
@Service("tcsmMessagePushSet")
public class TcsmMessagePushSetImpl implements ITcsmMessagePushSet {
    /**
     * 日志记录器
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TcsmMessagePushSetImpl.class);

    /**
     * 智慧工地-塔机监测系统-报警推送设置服务对象
     */
    @Autowired
    ITcsmMessagePushSetService<TcsmMessagePushSetEntity> tcsmMessagePushSetService;
    
    @Autowired
    ITcsmMessagePersonRecordService<TcsmMessagePersonRecordEntity> tcsmMessagePersonRecordService;

    /**
     * 智慧工地-塔机监测系统-报警推送设置列表查询
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警推送设置列表查询请求
     * @return 智慧工地-塔机监测系统-报警推送设置列表查询响应
     */
    public TcsmMessagePushSetListResponse getTcsmMessagePushSetList(TcsmMessagePushSetListRequest request){
        TcsmMessagePushSetListResponse response = new TcsmMessagePushSetListResponse();
        try {
            QueryParams<TcsmMessagePushSetEntity> queryParams = new QueryParams<TcsmMessagePushSetEntity>(request.getSearchParams());
			Page paging = request.getPaging();
			response.setPaging(paging);
			queryParams.setPaging(paging);
			queryParams.setOrderColumn(request.getOrderColumn());
			queryParams.setOrderMode(request.getOrderMode());
            List<TcsmMessagePushSetEntity> tcsmMessagePushSets = tcsmMessagePushSetService.queryByPage(queryParams);
            response.setPaging(queryParams.getPaging());
            response.setObjectList(tcsmMessagePushSets);
            response.setResultCode(ReturnResult.SUCCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 保存智慧工地-塔机监测系统-报警推送设置
     * 
     * @param request
     *            智慧工地-塔机监测系统-报警推送设置请求
     * @return 保存智慧工地-塔机监测系统-报警推送设置响应
     */
    public TcsmMessagePushSetResponse addTcsmMessagePushSet(TcsmMessagePushSetRequest request){
        TcsmMessagePushSetResponse response = new TcsmMessagePushSetResponse();
        try {
            TcsmMessagePushSetEntity entity = request.getEntity();
            tcsmMessagePushSetService.save(entity);
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
     * 删除智慧工地-塔机监测系统-报警推送设置通过唯一标识
     * 
     * @param id
     *            唯一标识
     * @return 删除智慧工地-塔机监测系统-报警推送设置响应
     */
    public TcsmMessagePushSetResponse deleteTcsmMessagePushSetById(Long id){
        TcsmMessagePushSetResponse response = new TcsmMessagePushSetResponse();
        try {
            tcsmMessagePushSetService.delete(id);
            response.setResultCode(ReturnResult.DELETE_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 修改智慧工地-塔机监测系统-报警推送设置
     * 
     * @param request
     *            修改智慧工地-塔机监测系统-报警推送设置请求
     * @return 修改智慧工地-塔机监测系统-报警推送设置响应
     */
    public TcsmMessagePushSetResponse updateTcsmMessagePushSet(TcsmMessagePushSetRequest request){
        TcsmMessagePushSetResponse response = new TcsmMessagePushSetResponse();
        try {
            tcsmMessagePushSetService.update(request.getEntity());
            response.setResultCode(ReturnResult.EDIT_SUCESS.getResultCode());
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            response.setResultCode(ReturnResult.FAIL.getResultCode());
            response.setResultMessage(ReturnResult.FAIL.getResultMessage());
        }
        return response;
    }

    /**
     * 通过ID获取智慧工地-塔机监测系统-报警推送设置
     * 
     * @param id
     *            唯一标识
     * @return 通过ID获取智慧工地-塔机监测系统-报警推送设置响应
     */
    public TcsmMessagePushSetResponse getTcsmMessagePushSetById(Long id){
        TcsmMessagePushSetResponse response = new TcsmMessagePushSetResponse();
        try {
            TcsmMessagePushSetEntity entity = tcsmMessagePushSetService.getById(id);
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
    public void pushPersonAlarm(List<TcsmMessagePushPersonEntity> personList,
    		String content) {
    	if (CollectionUtils.isEmpty(personList)) {
    		return;
    	}
    	
    	TcsmMessagePushSetEntity set = tcsmMessagePushSetService.getById(1L);
		if (set == null ) {
			return;
		}
		
		if (set.getMainSwitchStatus() == null || set.getMainSwitchStatus() != 1) {
			return;
		}
    	
    	try {
    		
    		
        	Integer webpush =set.getWebPushSwitchStatus();
			if(webpush != null && 1==webpush) {
				new PushWeb(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			Integer apppush =set.getAppPushSwitchStatus();
			if(apppush != null && 1==apppush) {
				new PushApp(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			Integer smspush =set.getSmsPushSwitchStatus();//短信推送
			if(smspush != null && 1==smspush) {
				new PushSms(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			Integer telpush =set.getTelPushSwitchStatus(); //电话
			if(telpush != null && 1==telpush) {
				new PushTel(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			Integer salpush =set.getSalPushSwitchStatus();//声光报警
			if(salpush != null && 1==salpush) {
				new PushSal(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			Integer dmbpush =set.getDmbPushSwitchStatus();//智能广播
			if(dmbpush != null && 1==dmbpush) {
				new PushDmb(tcsmMessagePersonRecordService, personList, 
						content).pushAll();
			}
			
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
    	
    }
}
