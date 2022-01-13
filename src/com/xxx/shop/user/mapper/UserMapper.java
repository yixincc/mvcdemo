package com.xxx.shop.user.mapper;

/**
 * 数据持久层：主要用来存取用户的数据，跟DB打交道 ，完成增删查改
 *
 */
public class UserMapper {
    /*
       获取用户的账号信息
     */
    public String getUserAccount(int userId) {
        System.out.println("链接数据库");
        System.out.println("用户id为："  + userId);
        return userId == 1 ? "yjxxt" : "";
    }

}
