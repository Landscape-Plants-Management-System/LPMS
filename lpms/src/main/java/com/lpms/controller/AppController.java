package com.lpms.controller;

import com.lpms.dao.DeviceDAO;
import com.lpms.dao.MonitoringRecordDAO;
import com.lpms.dao.RoleDAO;
import com.lpms.dao.UserDAO;
import com.lpms.dao.impl.DaoImpl;
import com.lpms.pojo.User;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Scanner;

public class AppController {
    boolean loginFlag;
    User myUser;
    Scanner scanner;
    public void initApp(){
        //初始化
        DaoImpl.initDAO();
        loginFlag=false;
        myUser=null;
        scanner = new Scanner(System.in);
    }

    public void loginApp(){
        System.out.println("欢迎登录植物园林关系系统");
        do {
            System.out.println("请输入用户名");
            String userName = scanner.nextLine();

            System.out.println("请输入密码");
            String password=scanner.nextLine();

            System.out.println(userName+"::"+password);

            myUser=DaoImpl.userDAO.getUserByName(userName);
            if(myUser!=null)
            {
                if(myUser.getUserPassword().equals(password)) {
                    loginFlag=true;
                }else {
                    System.out.println("密码输入错误");
                }
            }else{
                System.out.println("该用户不存在");
            }
        }while(!loginFlag);

        //登陆成功
        switch (myUser.getRoleId())
        {
            case 1:
                //上级主管部门页面功能
                System.out.println("主管部门登陆成功");
                DeptInChargeController deptInChargeController=new DeptInChargeController();
                deptInChargeController.indexIn();
                break;
            case 2:
                //系统管理员功能
                System.out.println("系统管理员登陆成功");
                SysAdminController sysAdminController=new SysAdminController();
                sysAdminController.indexIn();
                break;
            case 3:
                //监测人员功能
                System.out.println("监测人员登陆成功");
                MonPersonnelController monPersonnelController=new MonPersonnelController();
                monPersonnelController.indexIn();
                break;
            case 4:
                //养护人员
                System.out.println("养护人员登陆成功");
                MaintenancePersonnelController maintenancePersonnelController=new MaintenancePersonnelController();
                maintenancePersonnelController.indexIn();
                break;
        }
    }

    public void appIn(){
        initApp();
        loginApp();
    }
}
