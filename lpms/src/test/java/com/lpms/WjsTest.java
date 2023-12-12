package com.lpms;

import com.lpms.dao.DeviceDAO;
import com.lpms.dao.RoleDAO;
import com.lpms.dao.TestDAO;
import com.lpms.dao.UserDAO;
import com.lpms.pojo.Device;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
