package com.bj186.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping("/Test")
    public String string(){
        System.out.println("访问成功");
        return "成功";
    }
}
