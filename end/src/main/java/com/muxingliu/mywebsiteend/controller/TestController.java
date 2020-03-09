package com.muxingliu.mywebsiteend.controller;

import com.muxingliu.mywebsiteend.base.Response;
import com.muxingliu.mywebsiteend.base.ResponseUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("test")
    public Response test(){
        System.out.println("是势均力敌是谁 ");

        Map<String, String> resultMap = new HashMap<String,String>();
        resultMap.put("name", "zhang");
        resultMap.put("age","24");
        return ResponseUtil.success(resultMap);

    }
}
