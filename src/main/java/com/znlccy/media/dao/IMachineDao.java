package com.znlccy.media.dao;

import com.znlccy.media.dao.support.IBaseDao;
import com.znlccy.media.entity.Machine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type IMachineDao
 *
 * FileName：IMachineDao.java
 * Description：	机台Dao类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/15-22:44			create
 */
@Repository
public interface IMachineDao extends IBaseDao<Machine, Integer> {

    /**
     * 通过名称查找
     * @param searchText
     * @param pageable
     * @return
     */
    Page<Machine> findAllByNameContaining(String searchText, Pageable pageable);

}
