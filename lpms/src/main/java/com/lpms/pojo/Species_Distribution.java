package com.lpms.pojo;

public class Species_Distribution {
    private Long species_distribution_id;//关系ID，主键
    private Long species_id;//种ID，外键
    private Long distribution_id;//分布区域ID，外键

    public Species_Distribution() {
    }

    public Species_Distribution(Long species_distribution_id, Long species_id, Long distribution_id) {
        this.species_distribution_id = species_distribution_id;
        this.species_id = species_id;
        this.distribution_id = distribution_id;
    }

    public Long getSpecies_distribution_id() {
        return species_distribution_id;
    }

    public void setSpecies_distribution_id(Long species_distribution_id) {
        this.species_distribution_id = species_distribution_id;
    }

    public Long getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Long species_id) {
        this.species_id = species_id;
    }

    public Long getDistribution_id() {
        return distribution_id;
    }

    public void setDistribution_id(Long distribution_id) {
        this.distribution_id = distribution_id;
    }

    @Override
    public String toString() {
        return "species_distribution{" +
                "species_distribution_id=" + species_distribution_id +
                ", species_id=" + species_id +
                ", distribution_id=" + distribution_id +
                '}';
    }
}
