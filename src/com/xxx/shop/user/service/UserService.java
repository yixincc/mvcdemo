package com.xxx.shop.user.service;

import com.xxx.shop.user.mapper.UserMapper;

/**
 *
 * 业务逻辑层：参数的合法校验封装和DB数据的处理
 */
public class UserService {
    public String getUserAccount(int userId) {
        // 参数的合法性校验
        // 不合法
        if (userId <= 0) {
            System.out.println("您输入的主键为:" + userId + "该参数不合法");
            return "";
        }
        // 合法
        UserMapper userMapper = new UserMapper();
        String account = userMapper.getUserAccount(userId);
        // 数据库返回的数据处理
        if ("".equals("account")) {
            System.out.println("”参数不存在" + userId + "没有此用户");
            return "";
        }
        return account;
    }
}
