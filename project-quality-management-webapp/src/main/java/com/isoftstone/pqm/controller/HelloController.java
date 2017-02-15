package com.isoftstone.pqm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 包      名：  com.partner.web
 * 创 建 人：   寻欢
 * 创建时间：  2016/9/19 11:52
 * 修 改 人：
 * 修改日期：
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}