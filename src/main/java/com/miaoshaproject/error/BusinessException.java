package com.miaoshaproject.error;

/**
 * @program: miaosha
 * @description: 包装器业务异常类实现
 * @author: 程金鹏
 * @create: 2019-07-28 09:56
 */
public class BusinessException extends Exception implements CommonError {
    private CommonError commonError;

    //直接接收EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonerror) {
        super();
        this.commonError = commonerror;
    }

    //接收自定义errMsg的方式构造业务异常
    public BusinessException(CommonError commonError,String errmeg){
        super();
        this.commonError=commonError;
        this.commonError.setCommonErrorMeg(errmeg);
    }


    @Override
    public Integer getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMeg() {
        return this.commonError.getErrorMeg();
    }

    @Override
    public CommonError setCommonErrorMeg(String errorMeg) {

        return commonError;
    }
}
