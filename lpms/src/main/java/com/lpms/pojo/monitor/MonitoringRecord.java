package com.lpms.pojo.monitor;

import java.util.Date;

public class MonitoringRecord {
    private Integer monId;
    private Date monDate;
    private Integer monPlantId;
    private Integer userId;
    private Integer devId;
    private Float monStemGrowth;
    private Float monFruitGrowth;
    private Float monCanopyTemperature;
    private Float monLeafTemperature;
    private boolean monIsNormal;

    public MonitoringRecord() {
    }

    public MonitoringRecord(Integer monId, Date monDate, Integer monPlantId, Integer userId, Integer devId, Float monStemGrowth, Float monFruitGrowth, Float monCanopyTemperature, Float monLeafTemperature, boolean monIsNormal) {
        this.monId = monId;
        this.monDate = monDate;
        this.monPlantId = monPlantId;
        this.userId = userId;
        this.devId = devId;
        this.monStemGrowth = monStemGrowth;
        this.monFruitGrowth = monFruitGrowth;
        this.monCanopyTemperature = monCanopyTemperature;
        this.monLeafTemperature = monLeafTemperature;
        this.monIsNormal = monIsNormal;
    }

    @Override
    public String toString() {
        return "MonitoringRecord{" +
                "monId=" + monId +
                ", monDate=" + monDate +
                ", monPlantId=" + monPlantId +
                ", userId=" + userId +
                ", devId=" + devId +
                ", monStemGrowth=" + monStemGrowth +
                ", monFruitGrowth=" + monFruitGrowth +
                ", monCanopyTemperature=" + monCanopyTemperature +
                ", monLeafTemperature=" + monLeafTemperature +
                ", monIsNormal=" + monIsNormal +
                '}';
    }

    public Integer getMonId() {
        return monId;
    }

    public void setMonId(Integer monId) {
        this.monId = monId;
    }

    public Date getMonDate() {
        return monDate;
    }

    public void setMonDate(Date monDate) {
        this.monDate = monDate;
    }

    public Integer getMonPlantId() {
        return monPlantId;
    }

    public void setMonPlantId(Integer monPlantId) {
        this.monPlantId = monPlantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Float getMonStemGrowth() {
        return monStemGrowth;
    }

    public void setMonStemGrowth(Float monStemGrowth) {
        this.monStemGrowth = monStemGrowth;
    }

    public Float getMonFruitGrowth() {
        return monFruitGrowth;
    }

    public void setMonFruitGrowth(Float monFruitGrowth) {
        this.monFruitGrowth = monFruitGrowth;
    }

    public Float getMonCanopyTemperature() {
        return monCanopyTemperature;
    }

    public void setMonCanopyTemperature(Float monCanopyTemperature) {
        this.monCanopyTemperature = monCanopyTemperature;
    }

    public Float getMonLeafTemperature() {
        return monLeafTemperature;
    }

    public void setMonLeafTemperature(Float monLeafTemperature) {
        this.monLeafTemperature = monLeafTemperature;
    }

    public boolean isMonIsNormal() {
        return monIsNormal;
    }

    public void setMonIsNormal(boolean monIsNormal) {
        this.monIsNormal = monIsNormal;
    }
}
