package com.muxingliu.mywebsiteend.dao;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public interface LoginDao {
    Map<String, Object> masterLogin(String account, String pwd);
}
