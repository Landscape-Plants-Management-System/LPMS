package com.lpms.controller;

import java.util.Scanner;

/**
 * 上级主管部门页面
 */
public class DeptInChargeController {
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
            System.out.println("请选择：1.园林植物基本信息查询 2.查询监测数据 3.查询养护记录 4.发布养护任务 5.删除养护任务 6.更新养护任务 7.为检测异常的植物添加养护记录");
            chooseFunction=scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    userSharingController.plantBasicQuery();
                    break;
                case 2:
                    userSharingController.queryMonitoringRecord();
                    break;
                case 3:
                    userSharingController.getAllConserveTask();
                    break;
                case 4:
                    userSharingController.InsertConserveTask();
                    break;
                case 5:
                    userSharingController.DeleteConserveTask();
                    break;
                case 6:
                    userSharingController.MainUpdateConserveTask();
                    break;
                case 7:
                    userSharingController.InsertUnnormalConserveTask();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 上级主管部门特有功能
     */
    public void queryAllWorker(){
        //查询所有工作人员
        System.out.println("请选择：1.查看所有监测人员信息 2.查看所有养护人员信息");
    }


}
