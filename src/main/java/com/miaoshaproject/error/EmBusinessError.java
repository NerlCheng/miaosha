package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    //20000开头为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在"),
    USER_LOGIN_FAIL(20002,"用户手机号或密码不正确"),
    USER_NOT_LOGIN(20003,"用户还未登陆"),
    //30000开头为交易信息错误定义
    STOCK_NOT_ENOUGH(30001,"库存不足"),
    ;

    private Integer errCode;
    private String errMsg;

//    构造函数
    EmBusinessError(Integer code,String mes){
        this.errCode=code;
        this.errMsg=mes;
    }

    @Override
    public Integer getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrorMeg() {
        return this.errMsg;
    }

    @Override
    public CommonError setCommonErrorMeg(String errorMeg) {
        this.errMsg=errorMeg;
        return this;
    }


}