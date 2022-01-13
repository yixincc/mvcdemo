package com.xxx.shop.user.controller;

import com.xxx.shop.user.service.UserService;

/**
 * 控制层：接收用户数据传递至业务逻辑层，接收业务逻辑层返回至前端
 */
public class UserController {
    /**
     * 根据用户的主键来查询用户信息
     *
     * @param userId 用户主键
     * @return
     */
    public String getUserAccountById(int userId) {
        UserService userService = new UserService();
        String account = userService.getUserAccount(userId);
        return account;
    }
}
