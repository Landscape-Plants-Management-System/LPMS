package com.lpms.pojo;

public class Plant {

    int plant_id;//植物id
    String plant_name;//植物名称
    String nickname;//植物别名
    String family_name;//科

    String genus_name;//属
    String species_name;//种

    String species_feature;//植物特征

    String species_cultivating;//培养技术

    String growth_name;//生长周期

    String species_value;//应用价值

    String environment_name;//生长环境

    String distribution_provincial;//省

    String distribution_city;//市
    String distribution_country;//区

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getGenus_name() {
        return genus_name;
    }

    public void setGenus_name(String genus_name) {
        this.genus_name = genus_name;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public String getSpecies_feature() {
        return species_feature;
    }

    public void setSpecies_feature(String species_feature) {
        this.species_feature = species_feature;
    }

    public String getSpecies_cultivating() {
        return species_cultivating;
    }

    public void setSpecies_cultivating(String species_cultivating) {
        this.species_cultivating = species_cultivating;
    }

    public String getGrowth_name() {
        return growth_name;
    }

    public void setGrowth_name(String growth_name) {
        this.growth_name = growth_name;
    }

    public String getSpecies_value() {
        return species_value;
    }

    public void setSpecies_value(String species_value) {
        this.species_value = species_value;
    }

    public String getEnvironment_name() {
        return environment_name;
    }

    public void setEnvironment_name(String environment_name) {
        this.environment_name = environment_name;
    }

    public String getDistribution_provincial() {
        return distribution_provincial;
    }

    public void setDistribution_provincial(String distribution_provincial) {
        this.distribution_provincial = distribution_provincial;
    }

    public String getDistribution_city() {
        return distribution_city;
    }

    public void setDistribution_city(String distribution_city) {
        this.distribution_city = distribution_city;
    }

    public String getDistribution_country() {
        return distribution_country;
    }

    public void setDistribution_country(String distribution_country) {
        this.distribution_country = distribution_country;
    }
}
