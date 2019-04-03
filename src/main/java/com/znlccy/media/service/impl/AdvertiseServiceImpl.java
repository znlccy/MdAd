package com.znlccy.media.service.impl;

import com.znlccy.media.dao.support.IBaseDao;
import com.znlccy.media.entity.Advertise;
import com.znlccy.media.service.IAdvertiseService;
import com.znlccy.media.service.support.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * The type AdvertiseServiceImpl 
 *
 * FileName：AdvertiseServiceImpl.java
 * Description：	广告服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-10:58			create
 */
@Service
public class AdvertiseServiceImpl extends BaseServiceImpl<Advertise, Integer> implements IAdvertiseService {

    @Override
    public IBaseDao<Advertise, Integer> getBaseDao() {
        return null;
    }
}
