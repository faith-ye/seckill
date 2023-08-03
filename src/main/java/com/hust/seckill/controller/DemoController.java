package com.hust.seckill.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: DemoController
 * @description: 测试
 * @author: faith_ye
 * @date: 2023/8/3 19:39
 * @version: 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * @return null
     * @description 测试页面跳转
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "test");
        return "hello";
    }
}
