package com.lpms.dao;

import com.lpms.pojo.monitor.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MonitoringRecordDAO {
    //根据monId显示普通查询记录
    MonitoringRecordShow getMonitoringRecordById(@Param("monId")Integer monId);
    //显示普通查询记录
    List<MonitoringRecordShow>listMonitoringRecord();
    //显示植物地点详细信息
    List<MonitoringPlantAndPlaceShow>listMonitoringPlantAndPlaceShow();
    //查询植物详细信息及监测数据
    List<MonitoringPlantDetailInfo>listMonitoringPlantDetailInfo();
    //查询数据异常的植物
    List<MonitoringRecordShow>listNotNormalMonitoringRecordShow();
    //查询数据异常的植物ID
    List<Integer> listNotNormalMonitoringPlantId();

    //查询所有植物的4个数据的平均值，最大值，最小值查询
    MonitoringStatistics getMonitoringStatistics();

    //查询某种植物的4个数据的平均值，最大值，最小值查询
    MonitoringStatistics getMonitoringStatisticsByPlantId(@Param("plantId")Integer plantId);
    MonitoringStatistics getMonitoringStatisticsByPlantName(@Param("plantName")String plantName);

    //查询某属植物的4个数据的平均值，最大值，最小值查询
    MonitoringStatistics getMonitoringStatisticsByGenusName(@Param("genusName")String genusName);

    //查询某科植物的4个数据的平均值，最大值，最小值查询
    MonitoringStatistics getMonitoringStatisticsByFamilyName(@Param("familyName")String familyName);

    //查询某段时间植物的监测数据
    MonitoringStatistics getMonitoringStatisticsByDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    //增删改
    void insertMonitoringRecord(MonitoringRecord monitoringRecord);
    void deleteMonitoringRecordById(int monId);
    void updateMonitoringRecord(MonitoringRecord monitoringRecord);

}
