package com.lpms.dao;

import com.lpms.pojo.conserveTask.ConserveTask;

import java.util.List;

public interface ConserveTaskDao {
    //按ID查询
    ConserveTask getConserveTaskById(int conserveTaskId);
    //获取所有养护任务信息
    List<ConserveTask> getAllConserveTasks();
    List<ConserveTask> getConserveTaskByUserName(String username);
    //按养护任务名查询
    ConserveTask getConserveTaskByName(String conserveTaskName);
    //插入养护任务表
    int insertConserveTask(ConserveTask conserveTask);
    void insertPlantTaskRelation(int plantId, int conserveTaskId);
    //修改养护任务表
    void updateConserveTask(ConserveTask conserveTask);
    //删除养护任务表
    void deleteConserveTask(int conserveTaskId);

}
