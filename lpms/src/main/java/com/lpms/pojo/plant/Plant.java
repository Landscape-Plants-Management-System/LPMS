package com.lpms.pojo.plant;

public class Plant {
    int plant_id;//植物编号
    String plant_name;//植物名称

    int species_id;//种id

    int place_id;//地点id

    int growth_id;//生长周期id

    public int getGrowth_id() {
        return growth_id;
    }

    public void setGrowth_id(int growth_id) {
        this.growth_id = growth_id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

    public String getPlant_name() {
        return plant_name;
    }

    public void setPlant_name(String plant_name) {
        this.plant_name = plant_name;
    }

    public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }
}
