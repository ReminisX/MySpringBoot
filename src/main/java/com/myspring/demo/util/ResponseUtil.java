package com.myspring.demo.util;

import com.myspring.demo.entity.base.BaseResponse;
import com.myspring.demo.entity.base.BaseStatus;

/**
 * @Author ZhangXD
 * @Date 2021/11/10 14:26
 * @Description
 */
public class ResponseUtil {

    public static BaseResponse baseResponse(){
        return new BaseResponse();
    }

    public static BaseResponse success(){
        return new BaseResponse().success();
    }

    public static BaseResponse faliure(){
        return new BaseResponse().failure();
    }

    public static BaseResponse error(BaseStatus baseStatus){
        return new BaseResponse(baseStatus);
    }

}
