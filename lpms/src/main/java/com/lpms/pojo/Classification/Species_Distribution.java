package com.lpms.pojo.Classification;

public class Species_Distribution {
    private Long speciesDistributionId;//关系ID，主键
    private Long speciesId;//种ID，外键
    private Long distributionId;//分布区域ID，外键

    public Species_Distribution() {
    }

    public Species_Distribution(Long speciesDistributionId, Long speciesId, Long distributionId) {
        this.speciesDistributionId = speciesDistributionId;
        this.speciesId = speciesId;
        this.distributionId = distributionId;
    }

    @Override
    public String toString() {
        return "Species_Distribution{" +
                "speciesDistributionId=" + speciesDistributionId +
                ", speciesId=" + speciesId +
                ", distributionId=" + distributionId +
                '}';
    }

    public Long getSpeciesDistributionId() {
        return speciesDistributionId;
    }

    public void setSpeciesDistributionId(Long speciesDistributionId) {
        this.speciesDistributionId = speciesDistributionId;
    }

    public Long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Long speciesId) {
        this.speciesId = speciesId;
    }

    public Long getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Long distributionId) {
        this.distributionId = distributionId;
    }
}
