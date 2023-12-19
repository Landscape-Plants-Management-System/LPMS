package com.lpms;

import com.lpms.dao.*;
import com.lpms.pojo.monitor.MonitoringStatistics;
import com.lpms.pojo.plant.PlantInfo;
import com.lpms.utils.SqlSessionUtils;
import com.lpms.utils.StringToDate;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class WjsTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        TestDAO testDAO=sqlSession.getMapper(TestDAO.class);
        //System.out.println(dynamicSQLMapper.selectEmpByNotNullByWhere(new Emp(null,null,34,null)));
        System.out.println(testDAO.queryAllTest());
        System.out.println("helloworld");
    }
/**
 * 植物测试代码
 */
  @Test
  public void plantTest()
  {
      System.out.println("植物基本数据测试");
      SqlSession sqlSession = SqlSessionUtils.getSqlSession();
      PlantDao p=sqlSession.getMapper(PlantDao.class);
      List<PlantInfo> l=p.selectAllPlant();
      for (int i=0;i<l.size();i++)
      {
         System.out.println(l.get(i).toString());
      }
  }

    /**
     * 设备表测试代码
     */
    @Test
    public void deviceTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeviceDAO deviceDAO=sqlSession.getMapper(DeviceDAO.class);

        //测试查询所有设备
        System.out.println(deviceDAO.listDevices());

        //测试根据设备编号查询一个设备
        System.out.println(deviceDAO.getDeviceByDevId(2));

        //测试根据设备名查询设备
        System.out.println(deviceDAO.getDeviceByDevName("红外线测温仪"));

        //测试根据功能查询设备
        System.out.println("测量茎干的仪器"+deviceDAO.listDeviceCanMonStem());
        System.out.println("测量果实大小的仪器"+deviceDAO.listDeviceCanMonFruit());
        System.out.println("测量叶面温度的仪器"+deviceDAO.listDeviceCanMonLeaf());
        System.out.println("测量冠层温度的仪器"+deviceDAO.listDeviceCanMonCanopy());

        //测试插入一条设备
//        deviceDAO.insertDevice(new Device(null,"DEX果实-树木茎干生长测量仪",true,true,false,false));
    }

    /**
     * 角色表测试代码
     */
    @Test
    public void roleTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        RoleDAO roleDAO=sqlSession.getMapper(RoleDAO.class);
        //查询测试
        System.out.println(roleDAO.listRoles());
        System.out.println(roleDAO.getRoleById(2));
        System.out.println(roleDAO.listRolesByName("监测人员"));
        System.out.println(roleDAO.listRolesBySysPrivilege());

    }

    /**
     * 角色表测试代码
     */
    @Test
    public void userTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserDAO userDAO =sqlSession.getMapper(UserDAO.class);
        //查询测试

    }

    /**
     * 监测记录测试代码
     */
    @Test
    public void monRecTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        MonitoringRecordDAO monitoringRecordDAO =sqlSession.getMapper(MonitoringRecordDAO.class);
        //查询所有植物的4个数据的平均值，最大值，最小值查询
        System.out.println(monitoringRecordDAO.getMonitoringStatistics());
        //查询某种植物的4个数据的平均值，最大值，最小值查询
        System.out.println(monitoringRecordDAO.getMonitoringStatisticsByPlantId(1));

        //查询某属植物的4个数据的平均值，最大值，最小值查询
        System.out.println(monitoringRecordDAO.getMonitoringStatisticsByGenusName("补血草属"));

        //查询某科植物的4个数据的平均值，最大值，最小值查询
        System.out.println(monitoringRecordDAO.getMonitoringStatisticsByFamilyName("白花丹科"));

        //查询某段时间植物的监测数据
        System.out.println(monitoringRecordDAO.getMonitoringStatisticsByDateRange(StringToDate.getStringToDate("2023-12-18 14:00:00"),StringToDate.getStringToDate("2023-12-18 15:00:00")));

        //增删改

    }
    @Test
    public void conserveTaskTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ConserveTaskDao conserveTaskDao =sqlSession.getMapper(ConserveTaskDao.class);
        //查询所有的养护任务
        System.out.println(conserveTaskDao.getAllConserveTasks());
        //根据id查找养护任务
        System.out.println(conserveTaskDao.getConserveTaskById(2));
        //根据名称查找养护任务
        System.out.println(conserveTaskDao.getConserveTaskByName("修剪花草"));
        //增删改
    }

    @Test
    public void DiseaseTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DiseaseDao diseaseDao =sqlSession.getMapper(DiseaseDao.class);
        //查询所有的病虫害
        System.out.println(diseaseDao.getAllDiseases());
        //根据id查找养护任务
        System.out.println(diseaseDao.getDiseaseById(2));
        //根据名称查找养护任务
        System.out.println(diseaseDao.getDiseaseByName("锈病"));
        //增删改
    }

    @Test
    public void MethodTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        MethodDao methodDao =sqlSession.getMapper(MethodDao.class);
        //查询所有的防治方法
        System.out.println(methodDao.getAllMethods());
        //根据id查找防治方法
        System.out.println(methodDao.getMethodById(3));
        //根据名称查找防治方法
        System.out.println(methodDao.getMethodByName("消毒处理"));
        //增删改
    }
}
