package com.lpms.pojo.classification;

public class Family_Genus_Species_Info {
    private Long familyId; //科ID
    String familyName;//科名
    private Long genusId; //属ID
    String genusName;//属名
    private Long speciesId; //种ID
    String speciesName;//种名

    public Family_Genus_Species_Info() {
    }

    public Family_Genus_Species_Info(Long familyId, String familyName, Long genusId, String genusName,
                                     Long speciesId, String speciesName) {
        this.familyId = familyId;
        this.familyName = familyName;
        this.genusId = genusId;
        this.genusName = genusName;
        this.speciesId = speciesId;
        this.speciesName = speciesName;
    }

    @Override
    public String toString() {
        return "Family_Genus_Species_Info{" +
                "familyId=" + familyId +
                ", familyName='" + familyName + '\'' +
                ", genusId=" + genusId +
                ", genusName='" + genusName + '\'' +
                ", speciesId=" + speciesId +
                ", speciesName='" + speciesName + '\'' +
                '}';
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Long getGenusId() {
        return genusId;
    }

    public void setGenusId(Long genusId) {
        this.genusId = genusId;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
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
}
