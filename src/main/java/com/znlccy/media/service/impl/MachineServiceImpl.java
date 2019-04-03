package com.znlccy.media.service.impl;

import com.znlccy.media.dao.support.IBaseDao;
import com.znlccy.media.service.support.impl.BaseServiceImpl;
import com.znlccy.media.entity.Machine;
import com.znlccy.media.service.IMachineService;
import org.springframework.stereotype.Service;

/**
 * The type MachineServiceImpl
 *
 * FileName：MachineServiceImpl.java
 * Description：	机台服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/15-22:34			create
 */
@Service
public class MachineServiceImpl extends BaseServiceImpl<Machine, Integer> implements IMachineService {

    @Override
    public IBaseDao<Machine, Integer> getBaseDao() {
        return null;
    }
}
