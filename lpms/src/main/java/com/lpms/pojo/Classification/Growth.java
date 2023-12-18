package com.lpms.pojo.Classification;

public class Growth {
    private Long growthId;//生长周期ID，自增主键
    private String growthName;//生长周期名称

    public Growth() {
    }

    public Growth(Long growthId, String growthName) {
        this.growthId = growthId;
        this.growthName = growthName;
    }

    @Override
    public String toString() {
        return "Growth{" +
                "growthId=" + growthId +
                ", growthName='" + growthName + '\'' +
                '}';
    }

    public Long getGrowthId() {
        return growthId;
    }

    public void setGrowthId(Long growthId) {
        this.growthId = growthId;
    }

    public String getGrowthName() {
        return growthName;
    }

    public void setGrowthName(String growthName) {
        this.growthName = growthName;
    }
}
