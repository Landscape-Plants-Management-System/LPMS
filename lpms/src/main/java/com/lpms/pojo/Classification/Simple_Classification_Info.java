package com.lpms.pojo.Classification;

public class Simple_Classification_Info {
    String familyName;//科
    String genusName;//属
    String speciesName;//种
    String environmentName;//生长环境

    public Simple_Classification_Info() {
    }

    public Simple_Classification_Info(String familyName, String genusName, String speciesName, String environmentName) {
        this.familyName = familyName;
        this.genusName = genusName;
        this.speciesName = speciesName;
        this.environmentName = environmentName;
    }

    @Override
    public String toString() {
        return "Simple_Classification_Info{" +
                "familyName='" + familyName + '\'' +
                ", genusName='" + genusName + '\'' +
                ", speciesName='" + speciesName + '\'' +
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

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
}
