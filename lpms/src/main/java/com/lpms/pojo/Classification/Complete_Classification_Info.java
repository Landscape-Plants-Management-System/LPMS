package com.lpms.pojo.Classification;

public class Complete_Classification_Info {
    String familyName;//科
    String genusName;//属
    String speciesName;//种
    String speciesNickname;//植物别名
    String speciesFeature;//植物特征
    String speciesCultivating;//培养技术
    String growthName;//生长周期
    String speciesValue;//应用价值
    String distributionProvincial;//分布区域（省）
    String environmentName;//生长环境

    public Complete_Classification_Info() {
    }

    public Complete_Classification_Info(String familyName, String genusName, String speciesName, String speciesNickname,
                                        String speciesFeature, String speciesCultivating, String growthName,
                                        String speciesValue, String distributionProvincial, String environmentName) {
        this.familyName = familyName;
        this.genusName = genusName;
        this.speciesName = speciesName;
        this.speciesNickname = speciesNickname;
        this.speciesFeature = speciesFeature;
        this.speciesCultivating = speciesCultivating;
        this.growthName = growthName;
        this.speciesValue = speciesValue;
        this.distributionProvincial = distributionProvincial;
        this.environmentName = environmentName;
    }

    @Override
    public String toString() {
        return "Complete_Classification_Info{" +
                "familyName='" + familyName + '\'' +
                ", genusName='" + genusName + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", speciesNickname='" + speciesNickname + '\'' +
                ", speciesFeature='" + speciesFeature + '\'' +
                ", speciesCultivating='" + speciesCultivating + '\'' +
                ", growthName='" + growthName + '\'' +
                ", speciesValue='" + speciesValue + '\'' +
                ", distributionProvincial='" + distributionProvincial + '\'' +
                ", environmentName='" + environmentName + '\'' +
                '}';
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
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

    public String getGrowthName() {
        return growthName;
    }

    public void setGrowthName(String growthName) {
        this.growthName = growthName;
    }

    public String getSpeciesValue() {
        return speciesValue;
    }

    public void setSpeciesValue(String speciesValue) {
        this.speciesValue = speciesValue;
    }

    public String getDistributionProvincial() {
        return distributionProvincial;
    }

    public void setDistributionProvincial(String distributionProvincial) {
        this.distributionProvincial = distributionProvincial;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
}
