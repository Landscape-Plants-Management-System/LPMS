package com.lpms.pojo.classification;

public class Family {
    private int familyId; //科ID，主键
    private String familyName; //科名

    public Family() {
    }

    public Family(int familyId, String familyName) {
        this.familyId = familyId;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyId=" + familyId +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
