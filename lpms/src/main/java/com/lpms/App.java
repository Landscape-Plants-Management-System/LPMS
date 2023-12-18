//package com.lpms;
//
//import com.lpms.dao.TestDAO;
//import com.lpms.dao.UserDAO;
//import com.lpms.pojo.User;
//import com.lpms.utils.SqlSessionUtils;
//import com.mysql.cj.Session;
//import com.sun.org.apache.bcel.internal.generic.SWITCH;
//import org.apache.ibatis.session.SqlSession;
//
//import java.util.Scanner;
//
//
//public class App
//{
//    public static void main( String[] args )
//    {
//        boolean login_flag=false;
//        User myuser=null;
//        Scanner scanner = new Scanner(System.in);
//         System.out.println("欢迎登录植物园林管理系统！");
//       do {
//           System.out.println("请输入登录账号：");
//            String user_name = scanner.next();
//
//            System.out.println("请输入登录密码：");
//            String password=scanner.next();
//
//           UserDAO userdao=SqlSessionUtils.getSqlSession().getMapper(UserDAO.class);
//           myuser=userdao.getUserByName(user_name);
//           if(myuser!=null)
//           {
//               if(myuser.getPassword().equals(password))
//               {
//                   login_flag=true;
//               }else {
//
//                   System.out.println("密码输入错误");
//               }
//           }else{
//               System.out.println("该用户不存在");
//           }
//
//       }while(login_flag);
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
//                case "监测人员":
//                    //监测人员功能
//
//                    break;
//                case "普通用户":
//                    //普通用户
//
//                    break;
//
//
//            }
//            System.out.println("");
//
//
//
//        }
//
//
//
//
//    }
//}
