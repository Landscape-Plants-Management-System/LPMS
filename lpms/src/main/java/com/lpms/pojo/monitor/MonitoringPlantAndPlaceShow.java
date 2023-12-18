package com.lpms.pojo.monitor;

import java.util.Date;

public class MonitoringPlantAndPlaceShow {
    private Integer monId;
    private Date monDate;
    private Integer plantId;
    private String plantName;
    private String province;
    private String city;
    private String district;
    private String streets;
    private String location;
    @Override
    public String toString() {
        return "MonitoringPlantAndPlaceShow{" +
                "monId=" + monId +
                ", monDate=" + monDate +
                ", plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", streets='" + streets + '\'' +
                ", location='" + location + '\'' +
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

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
