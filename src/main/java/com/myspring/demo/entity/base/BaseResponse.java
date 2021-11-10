package com.myspring.demo.entity.base;

import io.swagger.annotations.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @Author ZhangXD
 * @Date 2021/10/24 11:11
 * @Description
 */
@Component
public class BaseResponse extends HashMap {

    public BaseResponse() {
    }

    public BaseResponse(BaseStatus baseStatus){
        put("code", baseStatus.getCode());
        put("message", baseStatus.getMessage());
    }

    public BaseResponse(Integer code, String message) {
        put("code", code);
        put("status", "Success");
        put("message", message);
    }

    public BaseResponse(String code, String message) {
        put("code", code);
        put("status", "Failure");
        put("message", message);
    }

    /**
     * 若成功访问，则返回正确信息
     * @return
     */
    public BaseResponse success() {
        if (containsKey("code")){
            remove("code");
        }
        if (containsKey("message")){
            remove("message");
        }
        if (containsKey("status")){
            remove("status");
        }
        put("status", "Success");
        put("code", 200);
        put("message", "访问-成功");
        return this;
    }

    /**
     * 若访问失败，则返回错误信息
     * @return
     */
    public BaseResponse failure() {
        if (containsKey("code")){
            remove("code");
        }
        if (containsKey("message")){
            remove("message");
        }
        if (containsKey("status")){
            remove("status");
        }
        put("status", "Failure");
        put("code", 404);
        put("message", "操作失败");
        return this;
    }

    /**
     * 添加Data
     * @param obj
     * @return
     */
    public BaseResponse addData(Object obj) {
        if (containsKey("data")){
            remove("data");
        }
        put("data", obj);
        return this;
    }

    /**
     * 添加任意元素
     * @param key
     * @param obj
     * @return
     */
    public BaseResponse addParam(String key, Object obj) {
        if (containsKey(key)){
            remove(key);
        }
        put(key, obj);
        return this;
    }

}
