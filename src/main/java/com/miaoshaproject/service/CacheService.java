package com.miaoshaproject.service;

/**
 * @program: miaosha
 * @description: 封装本地缓存接口类
 * @author: 程金鹏
 * @create: 2019-08-09 10:55
 */
public interface CacheService {
    //存方法
    void setCommonCache(String key,Object value);

    //取方法
    Object getFromCommonCache(String key);
}
