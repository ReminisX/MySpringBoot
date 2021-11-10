package com.myspring.demo.entity.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @EnumName:BaseStatus
 * @description: 通用状态码
 **/
public enum BaseStatus {
    /****** 通用错误("0-1000) ******/
	
    SUCCESS("200", "成功"),
    UNKNOWN_ERROR("101", "发生未知错误"),
    DUPLICATE_OPERATE("102", "重复操作"),
    RPC_ERROR("103", "RPC调用失败"),
    RECORD_NOT_FOUND("104", "记录不存在"),
    PARAM_ERROR("105", "参数错误"),
    NOT_SUPPORTED("106", "不支持此方法"),
    PARAMETER_IS_NULL("107", "请求参数为空"),
    VALIDATION_FAILED("410","用户名或密码错误"),
    CODE_500("500", "500内部错误"),
    DATA_NOT_EXIST("108","查询结果为空"),
    TOKEN_IS_NULL("109", "用户信息为空");
    private String code;
    private String message;

    BaseStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private static final Map<String, BaseStatus> intToEnum = new HashMap<>();

    static {
        for (BaseStatus p : values()) {
            intToEnum.put(p.getCode(), p);
        }
    }

    public static BaseStatus fromInt(Integer type) {
        try {
            return intToEnum.get(type);
        } catch (Exception e) {
            return UNKNOWN_ERROR;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
