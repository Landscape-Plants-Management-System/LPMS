package com.lpms;

import com.lpms.dao.ClassificationDao;
import com.lpms.pojo.classification.*;
import com.lpms.dao.*;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class ClassificationTest {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TestDAO testDAO=sqlSession.getMapper(TestDAO.class);
        System.out.println(testDAO.queryAllTest());
        System.out.println("这里是分类业务Dao层测试");
    }

    /**
     * 科表测试代码
     */
    @Test
    public void FamilyTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有科
        System.out.println(classificationDao.listFamilies());

        //测试根据科名查询科
        System.out.println(classificationDao.getFamilyByFamilyName("豆科"));

        //测试插入
        String name1 = "插入测试";
        String name2 = "test";
        System.out.print("请输入需要添加的科名1:"+name1+"\n");
        classificationDao.insertFamily(name1);
        System.out.print("请输入需要添加的科名2:"+name2+"\n");
        classificationDao.insertFamily(name2);

        //测试删除
        System.out.print("请输入需要删除的科名:");
        String name3 = "插入测试";
        classificationDao.deleteFamilyByName(name3);

        //测试更新
        String oldName = "插入测试";
        System.out.print("请输入需要更新前的科名:"+oldName+"\n");
        String newName = "更新测试";
        System.out.print("请输入需要更新后的科名:"+newName+"\n");
        classificationDao.updateFamilyNameByName(oldName,newName);

    }

    /**
     * 属表测试代码
     */
    @Test
    public void GenusTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有属
        System.out.println(classificationDao.listGenuses());

        //测试根据属ID查询属
        //System.out.println(classificationDao.getGenusByGenusId(1));

        //测试根据属名查询属
        System.out.println(classificationDao.getGenusByGenusName("柚属"));

        //测试插入
        String genusName = "插入测试";
        System.out.print("请输入需要添加的名字:"+genusName+"，所属的科名：陵齿蕨科 \n");
        Integer familyId = classificationDao.getFamilyIdByFamilyName("陵齿蕨科");
        classificationDao.insertGenus(genusName,familyId);

//        //测试删除
//        System.out.print("请输入需要删除的名字:");
//        String name3 = "插入测试";
//        classificationDao.deleteGenusByName(name3);

        //测试更新
        String oldName = "插入测试";
        System.out.print("请输入需要更新前的名字:"+oldName+"\n");
        String newName = "更新测试";
        System.out.print("请输入需要更新后的名字:"+newName+"\n");
        classificationDao.updateGenusNameByName(oldName,newName);
    }

    /**
     * 种表测试代码
     */
    @Test
    public void SpeciesTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有种
        System.out.println(classificationDao.listSpecies());

        //测试根据种ID查询种
        //System.out.println(classificationDao.getSpeciesBySpeciesId(1));

        //测试根据种名查询种
        System.out.println(classificationDao.getSpeciesBySpeciesName("苹果"));

    }

    /**
     * 分布区域表测试代码
     */
    @Test
    public void DistributionTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有分布区域
        System.out.println(classificationDao.listDistributions());

        //测试根据分布区域ID查询分布区域
        //System.out.println(classificationDao.getFamilyByDistributionId(1));

        //测试根据分布区域名查询分布区域
        System.out.println(classificationDao.getFamilyByDistributionName("上海"));

    }

    /**
     * 生长环境表测试代码
     */
    @Test
    public void EnvironmentTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有生长环境
        System.out.println(classificationDao.listEnvironment());

        //测试根据生长环境ID查询生长环境
        //System.out.println(classificationDao.getEnvironmentByEnvironmentId(1));

        //测试根据生长环境名查询生长环境，支持模糊查询
        System.out.println(classificationDao.getEnvironmentByEnvironmentName("温带"));

    }

    /**
     * 生长阶段表测试代码
     */
    @Test
    public void GrowthTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);

        //测试查询所有生长阶段
        System.out.println(classificationDao.listGrowth());

        //测试根据生长阶段名查询生长阶段
        System.out.println(classificationDao.getGrowthByGrowthName("幼苗期"));



    }

    @Test
    public void testGetSimpleClassificationInfo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);
        String keyword = "白"; // 设置关键字
        List<Simple_Classification_Info> result = classificationDao.getSimpleClassificationInfo(keyword);
        for (Simple_Classification_Info info : result) {
            System.out.println(info); // 在控制台输出每一个结果
        }

    }

    @Test
    public void testGetCompleteClassificationInfo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao = sqlSession.getMapper(ClassificationDao.class);
        List<Complete_Classification_Info> result = classificationDao.getCompleteClassificationInfo();
        for (Complete_Classification_Info info : result) {
            System.out.println(info); // 在控制台输出每一个结果
        }
    }

    @Test
    public void findSubordinatePlantsFamily() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);
        String keyword = "白"; // 设置关键字
        List<Family_Genus_Species_Info> result = classificationDao.findSubordinatePlantsFamily(keyword);
        for (Family_Genus_Species_Info info : result) {
            System.out.println(info); // 在控制台输出每一个结果
        }
    }

    @Test
    public void findSubordinatePlantsGenus() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ClassificationDao classificationDao=sqlSession.getMapper(ClassificationDao.class);
        String keyword = "斑叶兰属"; // 设置关键字
        List<Family_Genus_Species_Info> result = classificationDao.findSubordinatePlantsGenus(keyword);
        for (Family_Genus_Species_Info info : result) {
            System.out.println(info); // 在控制台输出每一个结果
        }
    }

}