package com.zhhw.znh.yfb.tcsm.timer;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.zhhw.znh.yfb.tcsm.beans.entity.TcsmDeviceInfoEntity;
import com.zhhw.znh.yfb.tcsm.service.interfaces.ITcsmDeviceInfoService;


@Lazy(false)
@Component(value = "QuartzCheckOffline")
@EnableScheduling
public class QuartzCheckOffline {
 
	@Autowired
    ITcsmDeviceInfoService<TcsmDeviceInfoEntity> tcsmDeviceInfoService;
	
	@Scheduled(cron = "0 * * * * *")
	public void updateOfflineStatus() throws Exception {
		
		List<TcsmDeviceInfoEntity> allList = tcsmDeviceInfoService.queryAll();
		if (!CollectionUtils.isEmpty(allList)) {
			for (TcsmDeviceInfoEntity info : allList) {
				if (!info.getOnlines().equals("1")) {
					continue;
				}
				
				Date time = info.getLastonlinetime();
				if (new Date().after(DateUtils.addMinutes(time, 2)) ) {
					TcsmDeviceInfoEntity entity = tcsmDeviceInfoService.getById(info.getId());
					entity.setOnlines("0");
					tcsmDeviceInfoService.update(entity);
				}
			}
		}
	}

}
