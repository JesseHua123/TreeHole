package com.muxingliu.mywebsiteend.controller;

import com.muxingliu.mywebsiteend.base.Response;
import com.muxingliu.mywebsiteend.base.ResponseUtil;
import com.muxingliu.mywebsiteend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("masterLogin")
    public Response MasterLogin(String account, String pwd){
        Map<String,Object>  result = loginService.masterLogin(account,pwd);
        return ResponseUtil.success(result);
    }
}
