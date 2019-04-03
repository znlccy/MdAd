package com.znlccy.media.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type ProductController 
 *
 * FileName：ProductController.java
 * Description：	
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/16-9:57			create
 */
@Controller
@RequestMapping(value = "/admin/product")
public class ProductController {

    /**
     * 定义产品前缀
     */
    private static final String PREFIX = "product";

    /**
     * 产品首页
     * @return
     */
    @RequestMapping(value = {"", "/index"})
    public String index() {
        return PREFIX + "/index";
    }
}
