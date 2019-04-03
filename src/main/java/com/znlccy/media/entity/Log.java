package com.znlccy.media.entity;

import com.znlccy.media.entity.support.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * The type Log 
 *
 * FileName：Log.java
 * Description：	Log实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-10:59			create
 */
@Entity
@Table(name = "tb_log")
public class Log extends BaseEntity {

    /**
     * 日志主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 操作
     */
    private String method;

    /**
     *
     */
    private String params;

    /**
     *
     */
    private String ip;

    /**
     *
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
