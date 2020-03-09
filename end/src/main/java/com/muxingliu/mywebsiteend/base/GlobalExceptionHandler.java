package com.muxingliu.mywebsiteend.base;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 * 全局Controller层的异常处理
 * @author zhongwenhua
 * @version 1.0
 * @date 2020/3/8 10:59 下午
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有不可知的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    Response handleException(Exception e) {
       return ResponseUtil.error(-1, e.getMessage());
    }

    /**
     * 处理所有业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    Response handleException(BusinessException e){
        return ResponseUtil.error(-1,e.getMessage());
    }
}
