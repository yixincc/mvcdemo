package com.xxx.shop.user.test;

import com.xxx.shop.user.controller.UserController;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        //模拟用户输入
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到xx系统，请输入用户主键");
        int userId = scan.nextInt();
        UserController userController = new UserController();
        String account = userController.getUserAccountById(userId);
        System.out.println(account);
    }
}
