package com.lpms.pojo.plant;

public class PlantInfo {

    int plantId;//植物id
    String plantName;//植物标识名
    String speciesName;//种
    String genusName;//属
    String familyName;//科

    String speciesFeature;//植物特征
    String growthName;//生长周期
    String speciesValue;//应用价值
    String speciesCultivating;//培养技术

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
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

    public String getSpeciesFeature() {
        return speciesFeature;
    }

    public void setSpeciesFeature(String speciesFeature) {
        this.speciesFeature = speciesFeature;
    }

    public String getGrowthName() {
        return growthName;
    }

    public void setGrowthName(String growthName) {
        this.growthName = growthName;
    }

    public String getSpeciesValue() {
        return speciesValue;
    }

    public void setSpeciesValue(String speciesValue) {
        this.speciesValue = speciesValue;
    }

    public String getSpeciesCultivating() {
        return speciesCultivating;
    }

    public void setSpeciesCultivating(String speciesCultivating) {
        this.speciesCultivating = speciesCultivating;
    }

    @Override
    public String toString() {
        return "PlantInfo{" +
                "plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", genusName='" + genusName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", speciesFeature='" + speciesFeature + '\'' +
                ", growthName='" + growthName + '\'' +
                ", speciesValue='" + speciesValue + '\'' +
                ", speciesCultivating='" + speciesCultivating + '\'' +
                '}';
    }
}
