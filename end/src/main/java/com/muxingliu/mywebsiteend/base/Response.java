package com.muxingliu.mywebsiteend.base;

/**
 * TODO
 * http 请求返回的最外层对象
 * @author zhongwenhua
 * @version 1.0
 * @date 2020/3/8 10:08 下午
 */
public class Response<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回内容
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
