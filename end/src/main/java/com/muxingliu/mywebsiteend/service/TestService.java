package com.muxingliu.mywebsiteend.service;

import com.muxingliu.mywebsiteend.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zhongwenhua
 * @version 1.0
 * @date 2020/3/14 3:56 下午
 */
@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public void testService(){
        testDao.testsql();
    }

}
