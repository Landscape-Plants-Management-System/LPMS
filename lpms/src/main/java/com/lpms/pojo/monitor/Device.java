package com.lpms.pojo.monitor;

public class Device {
    private Long devId; // 设备ID，主键
    private String devName; // 设备名称
    private boolean devCanMonitorStemGrowth; // 是否可以监测茎杆生长
    private boolean devCanMonitorFruitGrowth; // 是否可以监测果实生长
    private boolean devCanMonitorCanopyTemperature; // 是否可以监测冠层温度
    private boolean devCanMonitorLeafTemperature; // 是否可以监测叶面温度

    public Device() {
    }

    public Device(Long devId, String devName, boolean devCanMonitorStemGrowth, boolean devCanMonitorFruitGrowth, boolean devCanMonitorCanopyTemperature, boolean devCanMonitorLeafTemperature) {
        this.devId = devId;
        this.devName = devName;
        this.devCanMonitorStemGrowth = devCanMonitorStemGrowth;
        this.devCanMonitorFruitGrowth = devCanMonitorFruitGrowth;
        this.devCanMonitorCanopyTemperature = devCanMonitorCanopyTemperature;
        this.devCanMonitorLeafTemperature = devCanMonitorLeafTemperature;
    }

    @Override
    public String toString() {
        return "Device{" +
                "devId=" + devId +
                ", devName='" + devName + '\'' +
                ", devCanMonitorStemGrowth=" + devCanMonitorStemGrowth +
                ", devCanMonitorFruitGrowth=" + devCanMonitorFruitGrowth +
                ", devCanMonitorCanopyTemperature=" + devCanMonitorCanopyTemperature +
                ", devCanMonitorLeafTemperature=" + devCanMonitorLeafTemperature +
                '}';
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public boolean isDevCanMonitorStemGrowth() {
        return devCanMonitorStemGrowth;
    }

    public void setDevCanMonitorStemGrowth(boolean devCanMonitorStemGrowth) {
        this.devCanMonitorStemGrowth = devCanMonitorStemGrowth;
    }

    public boolean isDevCanMonitorFruitGrowth() {
        return devCanMonitorFruitGrowth;
    }

    public void setDevCanMonitorFruitGrowth(boolean devCanMonitorFruitGrowth) {
        this.devCanMonitorFruitGrowth = devCanMonitorFruitGrowth;
    }

    public boolean isDevCanMonitorCanopyTemperature() {
        return devCanMonitorCanopyTemperature;
    }

    public void setDevCanMonitorCanopyTemperature(boolean devCanMonitorCanopyTemperature) {
        this.devCanMonitorCanopyTemperature = devCanMonitorCanopyTemperature;
    }

    public boolean isDevCanMonitorLeafTemperature() {
        return devCanMonitorLeafTemperature;
    }

    public void setDevCanMonitorLeafTemperature(boolean devCanMonitorLeafTemperature) {
        this.devCanMonitorLeafTemperature = devCanMonitorLeafTemperature;
    }
}
