package com.lpms.controller;

import java.util.Scanner;

/**
 * 系统管理员页面
 */
public class SysAdminController {
    int chooseFunction;
    Scanner scanner;
    UserSharingController userSharingController;
    private void initController(){
        //初始化控制器函数
        scanner=new Scanner(System.in);
        userSharingController=new UserSharingController();
    }
    public void indexIn(){
        initController();
        while(true){
            System.out.println("请选择：1.病虫害信息查询 2.添加病虫害记录 3.删除病虫记录 4.更新病虫害记录");
            chooseFunction=scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    userSharingController.getAllDisease();
                    break;
                case 2:
                    userSharingController.InsertDisease();
                    break;
                case 3:
                    userSharingController.DeleteDisease();
                    break;
                case 4:
                    userSharingController.UpdateDisease();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
