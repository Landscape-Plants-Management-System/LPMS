package com.lpms.pojo.monitor;

import java.util.Date;

public class MonitoringRecordShow {
    //用了视图mon_plant_user_device_v里的定义
    private Integer monId;
    private Date monDate;
    private Integer monPlantId;
    private String plantName;
    private Double monStemGrowth;
    private Double monFruitGrowth;
    private Double monCanopyTemperature;
    private Double monLeafTemperature;
    private Integer userId;
    private String userName;
    private Integer placeId;
    private String location;
    private Integer devId;
    private String devName;
    private boolean monIsNormal;

    @Override
    public String toString() {
        return "MonitoringRecordShow{" +
                "monId=" + monId +
                ", monDate=" + monDate +
                ", monPlantId=" + monPlantId +
                ", plantName='" + plantName + '\'' +
                ", monStemGrowth=" + monStemGrowth +
                ", monFruitGrowth=" + monFruitGrowth +
                ", monCanopyTemperature=" + monCanopyTemperature +
                ", monLeafTemperature=" + monLeafTemperature +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", placeId=" + placeId +
                ", location='" + location + '\'' +
                ", devId=" + devId +
                ", devName='" + devName + '\'' +
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

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Double getMonStemGrowth() {
        return monStemGrowth;
    }

    public void setMonStemGrowth(Double monStemGrowth) {
        this.monStemGrowth = monStemGrowth;
    }

    public Double getMonFruitGrowth() {
        return monFruitGrowth;
    }

    public void setMonFruitGrowth(Double monFruitGrowth) {
        this.monFruitGrowth = monFruitGrowth;
    }

    public Double getMonCanopyTemperature() {
        return monCanopyTemperature;
    }

    public void setMonCanopyTemperature(Double monCanopyTemperature) {
        this.monCanopyTemperature = monCanopyTemperature;
    }

    public Double getMonLeafTemperature() {
        return monLeafTemperature;
    }

    public void setMonLeafTemperature(Double monLeafTemperature) {
        this.monLeafTemperature = monLeafTemperature;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public boolean isMonIsNormal() {
        return monIsNormal;
    }

    public void setMonIsNormal(boolean monIsNormal) {
        this.monIsNormal = monIsNormal;
    }
}
