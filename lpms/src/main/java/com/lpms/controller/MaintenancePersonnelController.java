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
            System.out.println("请选择：1.查询所有养护任务 2.根据执行人员查询养护任务 3.完成养护任务" );
            chooseFunction=scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    userSharingController.getAllConserveTask();
                    break;
                case 2:
                    userSharingController.getConserveTaskByUsername();
                    break;
                case 3:
                    userSharingController.UpdateConserveTask();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
