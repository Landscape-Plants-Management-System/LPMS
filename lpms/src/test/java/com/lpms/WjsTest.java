package com.lpms;

import com.lpms.dao.ConserveTaskDao;
import com.lpms.dao.DiseaseDao;
import com.lpms.dao.TestDAO;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class WjsTest {
    @Test
    public void test1(){
        System.out.println("saf");
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ConserveTaskDao conserveTaskDao =sqlSession.getMapper(ConserveTaskDao.class);
        //System.out.println(dynamicSQLMapper.selectEmpByNotNullByWhere(new Emp(null,null,34,null)));
        System.out.println(conserveTaskDao.getAllConserveTasks());
    }
}
