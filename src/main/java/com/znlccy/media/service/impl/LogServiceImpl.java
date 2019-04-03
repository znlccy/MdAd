package com.znlccy.media.service.impl;

import com.znlccy.media.dao.support.IBaseDao;
import com.znlccy.media.entity.Log;
import com.znlccy.media.service.ILogService;
import com.znlccy.media.service.support.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * The type LogServiceImpl
 *
 * FileName：LogServiceImpl.java
 * Description：	
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-11:04			create
 */
@Service
public class LogServiceImpl extends BaseServiceImpl<Log, Integer> implements ILogService {
    @Override
    public IBaseDao<Log, Integer> getBaseDao() {
        return null;
    }
}
