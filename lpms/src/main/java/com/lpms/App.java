package com.lpms;

import com.lpms.dao.TestDAO;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("saf");
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TestDAO testDAO=sqlSession.getMapper(TestDAO.class);
        //System.out.println(dynamicSQLMapper.selectEmpByNotNullByWhere(new Emp(null,null,34,null)));
        System.out.println(testDAO.queryAllTest());
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("hhhhh");
    }
}
