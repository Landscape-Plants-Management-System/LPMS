package com.lpms.controller;

import com.lpms.dao.DeviceDAO;
import com.lpms.dao.MonitoringRecordDAO;
import com.lpms.dao.RoleDAO;
import com.lpms.dao.UserDAO;
import com.lpms.pojo.User;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

public class AppController {
    public static UserDAO userDAO;
    public static RoleDAO roleDAO;
    public static DeviceDAO deviceDAO;
    public static MonitoringRecordDAO monitoringRecordDAO;

    public static void initDAO() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);
        roleDAO = sqlSession.getMapper(RoleDAO.class);
        deviceDAO = sqlSession.getMapper(DeviceDAO.class);
        monitoringRecordDAO = sqlSession.getMapper(MonitoringRecordDAO.class);
    }
    public void appIn(){
        initDAO();
//        boolean login_flag=false;
//        User myuser=null;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("欢迎登录植物园林关系系统");
//        do {
//            System.out.println("请输入登录账号");
//            String user_name = scanner.next();
//
//            System.out.println("请输入登录密码");
//            String password=scanner.next();
//
//            UserDAO userdao=SqlSessionUtils.getSqlSession().getMapper(UserDAO.class);
//            myuser=userdao.selectUserByName(user_name);
//            if(myuser!=null)
//            {
//                if(myuser.getPassword().equals(password))
//                {
//                    login_flag=true;
//                }else {
//
//                    System.out.println("密码输入错误");
//                }
//            }else{
//                System.out.println("该用户不存在");
//            }
//
//        }while(login_flag);
//
//        if(login_flag)
//        {
//            switch (myuser.getRole().toString())
//            {
//                case "管理员":
//                    //管理员页面功能
//
//
//                    break;
//                case "养护人员":
//                    //养护人员功能
//
//                    break;
//                case "检测人员":
//                    //检测人员功能
//                    break;
//                case "普通用户":
//                    //普通用户
//
//                    break;
//
//
//            }
//
//        }

    }
}
