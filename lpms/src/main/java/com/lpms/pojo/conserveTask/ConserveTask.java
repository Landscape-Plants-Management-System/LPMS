package com.lpms.pojo.conserveTask;

import java.util.Date;
import java.util.List;

public class ConserveTask {
    private int conserveTask_id;
    private String conserveTask_name;
    private String conserveTask_describe;
    private int conserveTask_peopleid;
    private List<Integer> conserveTask_plantid;
    private List<String> conserveTask_plantname;
    private int conserveTask_placeid;
    private Date conserveTask_requiretime;
    private Date conserveTask_completetime;
    private Date conserveTask_createtime;
    private Date conserveTask_updatetime;

    public int getConserveTask_id() {
        return conserveTask_id;
    }

    public void setConserveTask_id(int conserveTask_id) {
        this.conserveTask_id = conserveTask_id;
    }

    public String getConserveTask_name() {
        return conserveTask_name;
    }

    public void setConserveTask_name(String conserveTask_name) {
        this.conserveTask_name = conserveTask_name;
    }

    public String getConserveTask_describe() {
        return conserveTask_describe;
    }

    public void setConserveTask_describe(String conserveTask_describe) {
        this.conserveTask_describe = conserveTask_describe;
    }

    public int getConserveTask_peopleid() {
        return conserveTask_peopleid;
    }

    public void setConserveTask_peopleid(int conserveTask_peopleid) {
        this.conserveTask_peopleid = conserveTask_peopleid;
    }

    public List<Integer> getConserveTask_plantid() {
        return conserveTask_plantid;
    }

    public void setConserveTask_plantid(List<Integer> conserveTask_plantid) {
        this.conserveTask_plantid = conserveTask_plantid;
    }

    public int getConserveTask_placeid() {
        return conserveTask_placeid;
    }

    public void setConserveTask_placeid(int conserveTask_placeid) {
        this.conserveTask_placeid = conserveTask_placeid;
    }

    public Date getConserveTask_requiretime() {
        return conserveTask_requiretime;
    }

    public void setConserveTask_requiretime(Date conserveTask_requiretime) {
        this.conserveTask_requiretime = conserveTask_requiretime;
    }

    public Date getConserveTask_completetime() {
        return conserveTask_completetime;
    }

    public void setConserveTask_completetime(Date conserveTask_completetime) {
        this.conserveTask_completetime = conserveTask_completetime;
    }

    public Date getConserveTask_createtime() {
        return conserveTask_createtime;
    }

    public void setConserveTask_createtime(Date conserveTask_createtime) {
        this.conserveTask_createtime = conserveTask_createtime;
    }

    public Date getConserveTask_updatetime() {
        return conserveTask_updatetime;
    }

    public void setConserveTask_updatetime(Date conserveTask_updatetime) {
        this.conserveTask_updatetime = conserveTask_updatetime;
    }

    @Override
    public String toString() {
        return "conserve_task{" +
                "conserveTask_id=" + conserveTask_id +
                ", conserveTask_name='" + conserveTask_name + '\'' +
                ", conserveTask_describe='" + conserveTask_describe + '\'' +
                ", conserveTask_peopleid=" + conserveTask_peopleid +
                ", conserveTask_plantid=" + conserveTask_plantid +
                ", conserveTask_placeid=" + conserveTask_placeid +
                ", conserveTask_requiretime=" + conserveTask_requiretime +
                ", conserveTask_completetime=" + conserveTask_completetime +
                ", conserveTask_createtime=" + conserveTask_createtime +
                ", conserveTask_updatetime=" + conserveTask_updatetime +
                '}';
    }
}
