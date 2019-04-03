package com.znlccy.media.entity;

import com.znlccy.media.entity.support.BaseEntity;

import javax.persistence.*;

/**
 * The type Machine
 *
 * FileName：Machine.java
 * Description：	机台实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/15-22:31			create
 */
@Entity
@Table(name = "tb_machine")
public class Machine extends BaseEntity {

    /**
     * 机台主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * 机台名称
     */
    private String name;

    /**
     * 机台编号
     */
    private String machineNumber;

    /**
     * 媒体
     */
    private String media;

    /**
     * 场所
     */
    private String place;

    /**
     * 点位
     */
    private String position;

    /**
     * GPS1
     */
    private String gpsOne;

    /**
     * GPS2
     */
    private String gpsTwo;

    /**
     * 机台序列号
     */
    private String machineSerial;

    /**
     * 填表人
     */
    private String fillMan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGpsOne() {
        return gpsOne;
    }

    public void setGpsOne(String gpsOne) {
        this.gpsOne = gpsOne;
    }

    public String getGpsTwo() {
        return gpsTwo;
    }

    public void setGpsTwo(String gpsTwo) {
        this.gpsTwo = gpsTwo;
    }

    public String getMachineSerial() {
        return machineSerial;
    }

    public void setMachineSerial(String machineSerial) {
        this.machineSerial = machineSerial;
    }

    public String getFillMan() {
        return fillMan;
    }

    public void setFillMan(String fillMan) {
        this.fillMan = fillMan;
    }
}
