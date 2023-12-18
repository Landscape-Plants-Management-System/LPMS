package com.lpms.dao;

import com.lpms.pojo.conserveTask.ConserveTask;

import java.util.Date;
import java.util.List;

public interface ConserveTaskDao {
    int addTask(ConserveTask conservetask);
    void addPlantTask(List<Integer> plantIds, int conserveTaskId);
    void deleteTask(int id);
    void updateTask(ConserveTask conservetask);
    void updateTime(Date completeTime, int conserveTaskId);

    List<ConserveTask> findAll();
}
