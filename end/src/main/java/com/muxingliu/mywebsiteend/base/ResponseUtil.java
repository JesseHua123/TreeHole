package com.muxingliu.mywebsiteend.base;

/**
 * TODO
 *
 * @author zhongwenhua
 * @version 1.0
 * @date 2020/3/8 10:11 下午
 */
public class ResponseUtil {

    public static Response sceess(){
        Response response = new Response();
        response.setCode(0);
        response.setMsg("success");
        return response;
    }

    public static Response success(Object data){
        Response response = new Response();
        response.setCode(0);
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    public static Response error(Integer code , String msg){
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }

}
