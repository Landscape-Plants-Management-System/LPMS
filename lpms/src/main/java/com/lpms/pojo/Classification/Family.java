package com.lpms.pojo.Classification;

public class Family {
    private Long family_id; //科ID，主键
    private String family_name; //科名

    public Family() {
    }

    public Family(Long family_id, String family_name) {
        this.family_id = family_id;
        this.family_name = family_name;
    }

    public Long getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Long family_id) {
        this.family_id = family_id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "family_id=" + family_id +
                ", family_name='" + family_name + '\'' +
                '}';
    }
}
