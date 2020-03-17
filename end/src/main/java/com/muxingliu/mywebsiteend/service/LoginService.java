package com.muxingliu.mywebsiteend.service;

import com.muxingliu.mywebsiteend.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public Map<String, Object> masterLogin(String account, String pwd){
       Map<String,Object> resultMap =  loginDao.masterLogin(account, pwd);
       return  resultMap;
    }
}
