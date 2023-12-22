package com.lpms.controller;

import com.lpms.dao.impl.DaoImpl;
import com.lpms.pojo.monitor.MonitoringRecordShow;

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
            System.out.println("请选择：1.查询所有养护任务 2.根据执行人员查询养护任务 3.完成养护任务 4.查询要养护的植物" );
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
                case 4:
                    listToConservePlant();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
    /**
     * 养护人员特有功能：4.查询要养护的植物
     */
    void listToConservePlant(){
        //展示所有的数据异常植物
        for (MonitoringRecordShow monitoringRecordShow : DaoImpl.monitoringRecordDAO.listNotNormalMonitoringRecordShow()) {
            System.out.println(monitoringRecordShow);
        }

    }
}
