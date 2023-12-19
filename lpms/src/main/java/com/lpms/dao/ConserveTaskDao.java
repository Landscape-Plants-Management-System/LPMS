package com.lpms.dao;

import com.lpms.pojo.conserveTask.ConserveTask;

import java.util.List;

public interface ConserveTaskDao {

    ConserveTask getConserveTaskById(int conserveTaskId);

    List<ConserveTask> getAllConserveTasks();

    void insertConserveTask(ConserveTask conserveTask);

    void updateConserveTask(ConserveTask conserveTask);

    void deleteConserveTask(int conserveTaskId);

}
