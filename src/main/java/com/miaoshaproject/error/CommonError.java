package com.miaoshaproject.error;

/**
 * @program: miaosha
 * @description: 通用错误接口
 * @author: 程金鹏
 * @create: 2019-07-28 09:41
 */
public interface CommonError {
    public Integer getErrorCode();
    public String getErrorMeg();
    public CommonError setCommonErrorMeg(String errorMeg);
}
