package com.lpms.pojo.Classification;

public class Species {
    private Long species_id; //种ID，主键
    private String species_name; //种名
    private String species_nickname; //别名
    private String species_feature; //植物的形态特征
    private String species_cultivating; //植物的培养技术要点
    private String species_value; //植物的应用价值
    private Long genus_id; //属ID，外键

    public Species() {
    }

    public Species(Long species_id, String species_name, String species_nickname, String species_feature,
                   String species_cultivating, String species_value, Long genus_id) {
        this.species_id = species_id;
        this.species_name = species_name;
        this.species_nickname = species_nickname;
        this.species_feature = species_feature;
        this.species_cultivating = species_cultivating;
        this.species_value = species_value;
        this.genus_id = genus_id;
    }

    public Long getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Long species_id) {
        this.species_id = species_id;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public String getSpecies_nickname() {
        return species_nickname;
    }

    public void setSpecies_nickname(String species_nickname) {
        this.species_nickname = species_nickname;
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

    public String getSpecies_value() {
        return species_value;
    }

    public void setSpecies_value(String species_value) {
        this.species_value = species_value;
    }

    public Long getGenus_id() {
        return genus_id;
    }

    public void setGenus_id(Long genus_id) {
        this.genus_id = genus_id;
    }

    @Override
    public String toString() {
        return "Species{" +
                "species_id=" + species_id +
                ", species_name='" + species_name + '\'' +
                ", species_nickname='" + species_nickname + '\'' +
                ", species_feature='" + species_feature + '\'' +
                ", species_cultivating='" + species_cultivating + '\'' +
                ", species_value='" + species_value + '\'' +
                ", genus_id=" + genus_id +
                '}';
    }
}
