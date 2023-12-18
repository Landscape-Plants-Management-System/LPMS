package com.lpms.pojo.Classification;

public class Simple_Classification_Info {
    private Long species_id; //种ID
    String family_name;//科
    String genus_name;//属
    String species_name;//种
    String distribution_provincial;//分布区域（省）
    String distribution_city;//分布区域（市）
    String environment_name;//生长环境\

    public Simple_Classification_Info() {
    }

    public Simple_Classification_Info(Long species_id, String family_name, String genus_name, String species_name,
                                      String distribution_provincial, String distribution_city, String environment_name) {
        this.species_id = species_id;
        this.family_name = family_name;
        this.genus_name = genus_name;
        this.species_name = species_name;
        this.distribution_provincial = distribution_provincial;
        this.distribution_city = distribution_city;
        this.environment_name = environment_name;
    }

    public Long getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Long species_id) {
        this.species_id = species_id;
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

    public String getEnvironment_name() {
        return environment_name;
    }

    public void setEnvironment_name(String environment_name) {
        this.environment_name = environment_name;
    }

    @Override
    public String toString() {
        return "Simple_Classification_Info{" +
                "species_id=" + species_id +
                ", family_name='" + family_name + '\'' +
                ", genus_name='" + genus_name + '\'' +
                ", species_name='" + species_name + '\'' +
                ", distribution_provincial='" + distribution_provincial + '\'' +
                ", distribution_city='" + distribution_city + '\'' +
                ", environment_name='" + environment_name + '\'' +
                '}';
    }
}
