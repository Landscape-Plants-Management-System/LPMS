package com.lpms.dao;

import com.lpms.pojo.disease.Disease;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DiseaseImpl implements DiseaseDao {

    private final SqlSessionFactory sqlSessionFactory;

    public DiseaseImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int addMethod(Disease disease) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.insert("com.lpms.dao.DiseaseDao.addMethod", disease);
            return disease.getMethod_id();
        }
    }

    @Override
    public int addDisease(Disease disease) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.insert("com.lpms.dao.DiseaseDao.adddisease", disease);
            return disease.getDisease_id();
        }
    }

    @Override
    public void deleteDisease(int id) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.delete("com.lpms.dao.DiseaseDao.deletedisease", id);
        }
    }

    @Override
    public void updateMethod(Disease disease) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.update("com.lpms.dao.DiseaseDao.updateMethod", disease);
        }
    }

    @Override
    public void updateDisease(Disease disease) {
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            sqlSession.update("com.lpms.dao.DiseaseDao.updatedisease", disease);
        }
    }

    @Override
    public List<Disease> findAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList("com.lpms.dao.DiseaseDao.findAll");
        }
    }
}
