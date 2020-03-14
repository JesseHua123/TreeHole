package com.muxingliu.mywebsiteend;

import com.muxingliu.mywebsiteend.dao.TestDao;
import com.muxingliu.mywebsiteend.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author zhongwenhua
 * @version 1.0
 * @date 2020/3/14 3:49 下午
 */
@SpringBootTest
public class TestDB {

    @Resource
    TestService testService;
    @Test
    public void test(){
        testService.testService();
    }


}
