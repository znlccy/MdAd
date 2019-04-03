package com.znlccy.media.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type LogController
 *
 * FileName：LogController.java
 * Description：日志管理控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-9:52			create
 */
@Controller
@RequestMapping(value = "/admin/log")
public class LogController {

    /**
     * 定义日志前缀
     */
    private static final String PREFIX = "admin/log";

    /**
     * 日志首页
     * @return
     */
    @RequestMapping(value = {"", "/index"})
    public String index() {
        return PREFIX + "/index";
    }
}
