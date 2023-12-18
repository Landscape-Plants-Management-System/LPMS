package com.lpms.pojo;

public class species_environment {
    private Long species_environment_id;
    private Long species_id;
    private Long environment_id;

    public species_environment() {
    }

    public species_environment(Long species_environment_id, Long species_id, Long environment_id) {
        this.species_environment_id = species_environment_id;
        this.species_id = species_id;
        this.environment_id = environment_id;
    }

    public Long getSpecies_environment_id() {
        return species_environment_id;
    }

    public void setSpecies_environment_id(Long species_environment_id) {
        this.species_environment_id = species_environment_id;
    }

    public Long getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(Long species_id) {
        this.species_id = species_id;
    }

    public Long getEnvironment_id() {
        return environment_id;
    }

    public void setEnvironment_id(Long environment_id) {
        this.environment_id = environment_id;
    }

    @Override
    public String toString() {
        return "species_environment{" +
                "species_environment_id=" + species_environment_id +
                ", species_id=" + species_id +
                ", environment_id=" + environment_id +
                '}';
    }
}
