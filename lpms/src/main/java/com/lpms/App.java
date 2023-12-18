package com.lpms;

import com.lpms.dao.*;
import com.lpms.pojo.Role;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static UserDAO userDAO;
    public static RoleDAO roleDAO;
    public static DeviceDAO deviceDAO;
    public static MonitoringRecordDAO monitoringRecordDAO;
    public static void initDAO(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        userDAO=sqlSession.getMapper(UserDAO.class);
        roleDAO=sqlSession.getMapper(RoleDAO.class);
        deviceDAO=sqlSession.getMapper(DeviceDAO.class);
        monitoringRecordDAO=sqlSession.getMapper(MonitoringRecordDAO.class);
    }

    public static void main( String[] args )
    {
        initDAO();
        System.out.println(deviceDAO.listDeviceCanMonCanopy());


    }
}
