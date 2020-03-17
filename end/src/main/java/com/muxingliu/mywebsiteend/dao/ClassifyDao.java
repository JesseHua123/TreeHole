package com.muxingliu.mywebsiteend.dao;

import com.muxingliu.mywebsiteend.entity.ClassifyEntity;
import org.springframework.stereotype.Component;

@Component
public interface ClassifyDao {

    void addClassify(ClassifyEntity classifyEntity);
}
