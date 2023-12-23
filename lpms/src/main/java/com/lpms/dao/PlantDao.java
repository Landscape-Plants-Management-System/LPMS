package com.lpms.dao;

import com.lpms.pojo.plant.Plant;
import com.lpms.pojo.plant.PlantInfo;
import com.lpms.pojo.plant.Plant_number;

import java.util.List;

public interface PlantDao {

    /**
     * 查询
     */
    //获取平台所有植物信息
    List<PlantInfo>selectAllPlant();

    //根据植物名称进行查询
    List<PlantInfo>selectPlantByName(String plant_name);

    //根据植物id进行查询
    PlantInfo selectPlantById(int plant_id);

    //模糊查询植物信息
    List<PlantInfo> elasticSearchPlant(String word);


    //统计每种植物的数量
    List<Plant_number> countPlant();



    /**
     * 插入
     */
    //增添新植物
    int insertPlant(Plant plant);




    /**
     * 修改
     */

    //修改植物生长周期
    int updatePlantgrowth(int plant_id, int growth_id );



    /**
     * 删除
     */
    int deletePlantById(int plant_id );



}
