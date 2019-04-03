package com.znlccy.media.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type OrderController
 *
 * FileName：OrderController.java
 * Description：	订单控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-9:33			create
 */
@Controller
@RequestMapping(value = "/admin/order")
public class OrderController {

    /**
     * 定义订单首页
     */
    private static final String PREFIX = "order";

    /**
     * 订单首页
     * @return
     */
    @RequestMapping(value = {"","/index"})
    public String index() {
        return PREFIX + "/index";
    }
}
