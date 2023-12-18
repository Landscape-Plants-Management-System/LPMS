package com.lpms.pojo;

public class Genus {
    private Long genus_id; //属ID，主键
    private String genus_name; //属名
    private Long family_id; //科ID，外键

    public Genus() {
    }

    public Genus(Long genus_id, String genus_name, Long family_id) {
        this.genus_id = genus_id;
        this.genus_name = genus_name;
        this.family_id = family_id;
    }

    public Long getGenus_id() {
        return genus_id;
    }

    public void setGenus_id(Long genus_id) {
        this.genus_id = genus_id;
    }

    public String getGenus_name() {
        return genus_name;
    }

    public void setGenus_name(String genus_name) {
        this.genus_name = genus_name;
    }

    public Long getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Long family_id) {
        this.family_id = family_id;
    }

    @Override
    public String toString() {
        return "Genus{" +
                "genus_id=" + genus_id +
                ", genus_name='" + genus_name + '\'' +
                ", family_id=" + family_id +
                '}';
    }
}
