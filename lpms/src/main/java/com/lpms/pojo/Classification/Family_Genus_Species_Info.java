package com.lpms.pojo.Classification;

public class Family_Genus_Species_Info {
    private Long family_id; //科ID
    String family_name;//科名
    private Long genus_id; //属ID
    String genus_name;//属名
    private Long species_id; //种ID
    String species_name;//种名

    public Family_Genus_Species_Info() {
    }

    public Family_Genus_Species_Info(Long family_id, String family_name, Long genus_id,
                                     String genus_name, Long species_id, String species_name) {
        this.family_id = family_id;
        this.family_name = family_name;
        this.genus_id = genus_id;
        this.genus_name = genus_name;
        this.species_id = species_id;
        this.species_name = species_name;
    }

    public Long getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Long family_id) {
        this.family_id = family_id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
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

    @Override
    public String toString() {
        return "family_genus_species_info{" +
                "family_id=" + family_id +
                ", family_name='" + family_name + '\'' +
                ", genus_id=" + genus_id +
                ", genus_name='" + genus_name + '\'' +
                ", species_id=" + species_id +
                ", species_name='" + species_name + '\'' +
                '}';
    }
}
