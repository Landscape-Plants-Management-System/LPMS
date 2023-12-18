package com.lpms.pojo.Classification;

public class Species_Environment {
    private Long speciesEnvironmentId;
    private Long speciesId;
    private Long environmentId;

    public Species_Environment() {
    }

    public Species_Environment(Long speciesEnvironmentId, Long speciesId, Long environmentId) {
        this.speciesEnvironmentId = speciesEnvironmentId;
        this.speciesId = speciesId;
        this.environmentId = environmentId;
    }

    @Override
    public String toString() {
        return "Species_Environment{" +
                "speciesEnvironmentId=" + speciesEnvironmentId +
                ", speciesId=" + speciesId +
                ", environmentId=" + environmentId +
                '}';
    }

    public Long getSpeciesEnvironmentId() {
        return speciesEnvironmentId;
    }

    public void setSpeciesEnvironmentId(Long speciesEnvironmentId) {
        this.speciesEnvironmentId = speciesEnvironmentId;
    }

    public Long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Long speciesId) {
        this.speciesId = speciesId;
    }

    public Long getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(Long environmentId) {
        this.environmentId = environmentId;
    }
}
