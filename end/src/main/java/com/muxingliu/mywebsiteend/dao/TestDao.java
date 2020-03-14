package com.muxingliu.mywebsiteend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface TestDao {
    void testsql();
}

