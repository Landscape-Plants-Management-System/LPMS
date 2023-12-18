package com.lpms.pojo.classification;

public class Genus {
    private Long genusId; //属ID，主键
    private String genusName; //属名
    private Long familyId; //科ID，外键

    public Genus() {
    }

    public Genus(Long genusId, String genusName, Long familyId) {
        this.genusId = genusId;
        this.genusName = genusName;
        this.familyId = familyId;
    }

    @Override
    public String toString() {
        return "Genus{" +
                "genusId=" + genusId +
                ", genusName='" + genusName + '\'' +
                ", familyId=" + familyId +
                '}';
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

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }
}
