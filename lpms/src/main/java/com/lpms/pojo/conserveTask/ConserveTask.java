package com.lpms.pojo.conserveTask;

import com.lpms.pojo.User;
import com.lpms.pojo.plant.Plant;

import java.util.Date;
import java.util.List;

public class ConserveTask {
    private int conserveTaskId;
    private String conserveTaskName;
    private String conserveTaskDescribe;
    private User user;
    private List<Plant> plant;
    private String conserveTaskPlace;
    private Date conserveTaskRequiretime;
    private Date conserveTaskCompletetime;
    private Date conserveTaskCreatetime;
    private Date conserveTaskUpdatetime;

    public int getConserveTaskId() {
        return conserveTaskId;
    }

    public void setConserveTaskId(int conserveTaskId) {
        this.conserveTaskId = conserveTaskId;
    }

    public String getConserveTaskName() {
        return conserveTaskName;
    }

    public void setConserveTaskName(String conserveTaskName) {
        this.conserveTaskName = conserveTaskName;
    }

    public String getConserveTaskDescribe() {
        return conserveTaskDescribe;
    }

    public void setConserveTaskDescribe(String conserveTaskDescribe) {
        this.conserveTaskDescribe = conserveTaskDescribe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }

    public String getConserveTaskPlace() {
        return conserveTaskPlace;
    }

    public void setConserveTaskPlace(String conserveTaskPlace) {
        this.conserveTaskPlace = conserveTaskPlace;
    }

    public Date getConserveTaskRequiretime() {
        return conserveTaskRequiretime;
    }

    public void setConserveTaskRequiretime(Date conserveTaskRequiretime) {
        this.conserveTaskRequiretime = conserveTaskRequiretime;
    }

    public Date getConserveTaskCompletetime() {
        return conserveTaskCompletetime;
    }

    public void setConserveTaskCompletetime(Date conserveTaskCompletetime) {
        this.conserveTaskCompletetime = conserveTaskCompletetime;
    }

    public Date getConserveTaskCreatetime() {
        return conserveTaskCreatetime;
    }

    public void setConserveTaskCreatetime(Date conserveTaskCreatetime) {
        this.conserveTaskCreatetime = conserveTaskCreatetime;
    }

    public Date getConserveTaskUpdatetime() {
        return conserveTaskUpdatetime;
    }

    public void setConserveTaskUpdatetime(Date conserveTaskUpdatetime) {
        this.conserveTaskUpdatetime = conserveTaskUpdatetime;
    }

    @Override
    public String toString() {
        return "ConserveTask{" +
                "conserveTaskId=" + conserveTaskId +
                ", conserveTaskName='" + conserveTaskName + '\'' +
                ", conserveTaskDescribe='" + conserveTaskDescribe + '\'' +
                ", user=" + user +
                ", plant=" + plant +
                ", conserveTaskPlace='" + conserveTaskPlace + '\'' +
                ", conserveTaskRequiretime=" + conserveTaskRequiretime +
                ", conserveTaskCompletetime=" + conserveTaskCompletetime +
                ", conserveTaskCreatetime=" + conserveTaskCreatetime +
                ", conserveTaskUpdatetime=" + conserveTaskUpdatetime +
                '}';
    }
}
