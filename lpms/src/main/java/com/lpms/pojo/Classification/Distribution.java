package com.lpms.pojo.Classification;

public class Distribution {
    private Long distributionId; //分布区域ID，主键
    private String distributionProvincial; //省级行政区

    public Distribution() {
    }

    public Distribution(Long distributionId, String distributionProvincial) {
        this.distributionId = distributionId;
        this.distributionProvincial = distributionProvincial;
    }

    @Override
    public String toString() {
        return "Distribution{" +
                "distributionId=" + distributionId +
                ", distributionProvincial='" + distributionProvincial + '\'' +
                '}';
    }

    public Long getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Long distributionId) {
        this.distributionId = distributionId;
    }

    public String getDistributionProvincial() {
        return distributionProvincial;
    }

    public void setDistributionProvincial(String distributionProvincial) {
        this.distributionProvincial = distributionProvincial;
    }
}
