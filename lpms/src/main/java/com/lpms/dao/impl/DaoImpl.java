package com.lpms.dao.impl;

import com.lpms.dao.*;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

public class DaoImpl {
    public static UserDAO userDAO;
    public static RoleDAO roleDAO;
    public static DeviceDAO deviceDAO;
    public static MonitoringRecordDAO monitoringRecordDAO;
    public static ClassificationDao classificationDao;
    public static PlantDao plantDao;

    public static void initDAO() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        userDAO = sqlSession.getMapper(UserDAO.class);
        roleDAO = sqlSession.getMapper(RoleDAO.class);
        deviceDAO = sqlSession.getMapper(DeviceDAO.class);
        monitoringRecordDAO = sqlSession.getMapper(MonitoringRecordDAO.class);
        plantDao=sqlSession.getMapper(PlantDao.class);
        classificationDao=sqlSession.getMapper(ClassificationDao.class);
    }
}
