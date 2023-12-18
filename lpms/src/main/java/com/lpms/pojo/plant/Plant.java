package com.lpms.pojo.plant;

public class Plant {
    int plantId;//植物编号
    String plantName;//植物名称

    int speciesId;//种id

    int placeId;//地点id

    int growthId;//生长周期id

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

    public int getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getGrowthId() {
        return growthId;
    }

    public void setGrowthId(int growthId) {
        this.growthId = growthId;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", speciesId=" + speciesId +
                ", placeId=" + placeId +
                ", growthId=" + growthId +
                '}';
    }
}
