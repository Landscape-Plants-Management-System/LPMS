package com.lpms.controller;

import java.util.Scanner;

/**
 * 养护人员页面
 */
public class MaintenancePersonnelController {
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
            System.out.println("请选择：1.园林植物基本信息查询");
            chooseFunction=scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    userSharingController.plantBasicQuery();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
