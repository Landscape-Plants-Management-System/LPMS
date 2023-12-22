package com.lpms.pojo.monitor;

import java.util.Date;

public class MonitoringPlantDetailInfo {
    private Integer monId;
    private Date monDate;
    private Double monStemGrowth;
    private Double monFruitGrowth;
    private Double monCanopyTemperature;
    private Double monLeafTemperature;
    private Integer plantId;
    private String plantName;
    private String speciesName;
    private String genusName;
    private String familyName;
    private boolean monIsNormal;

    @Override
    public String toString() {
        return "MonitoringPlantDetailInfo{" +
                "monId=" + monId +
                ", monDate=" + monDate +
                ", monStemGrowth=" + monStemGrowth +
                ", monFruitGrowth=" + monFruitGrowth +
                ", monCanopyTemperature=" + monCanopyTemperature +
                ", monLeafTemperature=" + monLeafTemperature +
                ", plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", genusName='" + genusName + '\'' +
                ", familyName='" + familyName + '\'' +
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

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public boolean isMonIsNormal() {
        return monIsNormal;
    }

    public void setMonIsNormal(boolean monIsNormal) {
        this.monIsNormal = monIsNormal;
    }
}
