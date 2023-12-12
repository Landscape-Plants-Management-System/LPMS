package com.lpms.dao;

import com.lpms.pojo.Device;
import com.lpms.pojo.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceDAO {
    /**
     * 查询
     */
    List<Device> listDevices();
    Device getDeviceByDevId(@Param("devId")Integer devId);
    Device getDeviceByDevName(@Param("devName")String devName);
    List<Device>  listDeviceCanMonStem();
    List<Device>  listDeviceCanMonFruit();
    List<Device>  listDeviceCanMonCanopy();
    List<Device>  listDeviceCanMonLeaf();

    /**
     * 插入
     */
    void insertDevice(Device device);

    /**
     * 删除
     */
    void deleteDeviceById(@Param("devId")Integer devId);
    void deleteDeviceByName(@Param("devName")String devName);

    /**
     * 修改
     */
    void updateDevice(Device device);
}
