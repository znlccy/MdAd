package com.znlccy.media.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type AdvertiseController
 *
 * FileName：AdvertiseController.java
 * Description：	广告管理控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-9:12			create
 */
@Controller
@RequestMapping(value = "/admin/advertise")
public class AdvertiseController {

    /**
     * 定义广告前缀
     */
    private static final String PREFIX = "advertise";

    /**
     * 广告首页
     * @return
     */
    @RequestMapping(value = {"", "/index"})
    public String index() {
        return PREFIX + "/index";
    }
}
