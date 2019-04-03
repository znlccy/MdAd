package com.znlccy.media.controller;

import com.znlccy.media.entity.Machine;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The type MachineController
 *
 * FileName：MachineController.java
 * Description：机台控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/15-22:25			create
 */
@Controller
@RequestMapping(value = "/admin/machine")
public class MachineController extends BaseController {

    /**
     * 声明前缀
     */
    private static final String PREFIX = "machine";

    /**
     * 机台首页
     * @return
     */
    @RequestMapping(value = {"", "/index"})
    public String index() {
        return PREFIX + "/index";
    }

    /**
     * 机台列表
     * @return
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Page<Machine> list() {
        return null;
    }
}
