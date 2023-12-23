package com.lpms.dao;

import com.lpms.pojo.conserveTask.PlantTask;

public interface PlantTaskDao {
    void insertPlantTask(PlantTask plantTask);
    void deletePlantTask(int conserveTask_id);
}
