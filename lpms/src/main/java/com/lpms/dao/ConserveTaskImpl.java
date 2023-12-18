package com.lpms.dao;

import com.lpms.pojo.conserveTask.ConserveTask;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConserveTaskImpl implements ConserveTaskDao {

    private final SqlSessionFactory sqlSessionFactory;

    public ConserveTaskImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int addTask(ConserveTask conservetask) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.insert("com.lpms.dao.ConserveTaskDao.addTask", conservetask);
            return conservetask.getConserveTask_id();
        }
    }

    @Override
    public void addPlantTask(List<Integer> plantIds, int conserveTaskId) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            Map<String, Object> params = new HashMap<>();
            params.put("plantIds", plantIds);
            params.put("conserveTaskId", conserveTaskId);
            sqlSession.insert("com.lpms.dao.ConserveTaskDao.addPlantTask", params);
        }
    }

    @Override
    public void deleteTask(int id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.delete("ConserveTaskDao.deletetask", id);
        }
    }

    @Override
    public void updateTask(ConserveTask conservetask) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.update("ConserveTaskDao.updatetask", conservetask);
        }
    }

    @Override
    public void updateTime(Date completeTime, int conserveTaskId) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            Map<String, Object> params = new HashMap<>();
            params.put("completeTime", completeTime);
            params.put("conserveTaskId", conserveTaskId);
            sqlSession.update("com.lpms.dao.ConserveTaskDao.updateTime", params);
        }
    }

    @Override
    public List<ConserveTask> findAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList("ConserveTaskDao.findAll");
        }
    }
}
