package com.znlccy.media.entity;

import com.znlccy.media.entity.support.BaseEntity;

import javax.persistence.*;

/**
 * The type Advertise 
 *
 * FileName：Advertise.java
 * Description：	广告实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-10:31			create
 */
@Entity
@Table(name = "tb_advertise")
public class Advertise extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
}
