package com.lpms.dao;

import com.lpms.pojo.PlantInfo;

import java.util.List;

public interface PlantDao {

    /**
     * 查询
     */
    //根据植物名称进行查询
    List<PlantInfo>selectPlantByName(String plant_name);

    //根据植物id进行查询
    PlantInfo selectPlantById(int plant_id);

    //模糊查询
    List<PlantInfo> elasticSearchPlant(String word);

    /**
     * 插入
     */
    //增添新植物
    int insterPlant(String plant_name,int species_id,int place_id );


    /**
     * 修改
     */







}
