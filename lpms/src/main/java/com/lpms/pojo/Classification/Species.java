package com.lpms.pojo.Classification;

public class Species {
    private Long speciesId; //种ID，主键
    private String speciesName; //种名
    private String speciesNickname; //别名
    private String speciesFeature; //植物的形态特征
    private String speciesCultivating; //植物的培养技术要点
    private String speciesValue; //植物的应用价值
    private Long genusId; //属ID，外键

    public Species() {
    }

    public Species(Long speciesId, String speciesName, String speciesNickname, String speciesFeature,
                   String speciesCultivating, String speciesValue, Long genusId) {
        this.speciesId = speciesId;
        this.speciesName = speciesName;
        this.speciesNickname = speciesNickname;
        this.speciesFeature = speciesFeature;
        this.speciesCultivating = speciesCultivating;
        this.speciesValue = speciesValue;
        this.genusId = genusId;
    }

    @Override
    public String toString() {
        return "Species{" +
                "speciesId=" + speciesId +
                ", speciesName='" + speciesName + '\'' +
                ", speciesNickname='" + speciesNickname + '\'' +
                ", speciesFeature='" + speciesFeature + '\'' +
                ", speciesCultivating='" + speciesCultivating + '\'' +
                ", speciesValue='" + speciesValue + '\'' +
                ", genusId=" + genusId +
                '}';
    }

    public Long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Long speciesId) {
        this.speciesId = speciesId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesNickname() {
        return speciesNickname;
    }

    public void setSpeciesNickname(String speciesNickname) {
        this.speciesNickname = speciesNickname;
    }

    public String getSpeciesFeature() {
        return speciesFeature;
    }

    public void setSpeciesFeature(String speciesFeature) {
        this.speciesFeature = speciesFeature;
    }

    public String getSpeciesCultivating() {
        return speciesCultivating;
    }

    public void setSpeciesCultivating(String speciesCultivating) {
        this.speciesCultivating = speciesCultivating;
    }

    public String getSpeciesValue() {
        return speciesValue;
    }

    public void setSpeciesValue(String speciesValue) {
        this.speciesValue = speciesValue;
    }

    public Long getGenusId() {
        return genusId;
    }

    public void setGenusId(Long genusId) {
        this.genusId = genusId;
    }
}
