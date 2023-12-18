package com.lpms.pojo.Classification;

public class Distribution {
    private Long distribution_id; //分布区域ID，主键
    private String distribution_provincial; //省级行政区
    private String distribution_city;//市级行政区
    private String distribution_county;//县级行政区

    public Distribution() {
    }

    public Distribution(Long distribution_id, String distribution_provincial, String distribution_city, String distribution_county) {
        this.distribution_id = distribution_id;
        this.distribution_provincial = distribution_provincial;
        this.distribution_city = distribution_city;
        this.distribution_county = distribution_county;
    }

    public Long getDistribution_id() {
        return distribution_id;
    }

    public void setDistribution_id(Long distribution_id) {
        this.distribution_id = distribution_id;
    }

    public String getDistribution_provincial() {
        return distribution_provincial;
    }

    public void setDistribution_provincial(String distribution_provincial) {
        this.distribution_provincial = distribution_provincial;
    }

    public String getDistribution_city() {
        return distribution_city;
    }

    public void setDistribution_city(String distribution_city) {
        this.distribution_city = distribution_city;
    }

    public String getDistribution_county() {
        return distribution_county;
    }

    public void setDistribution_county(String distribution_county) {
        this.distribution_county = distribution_county;
    }

    @Override
    public String toString() {
        return "Distribution{" +
                "distribution_id=" + distribution_id +
                ", distribution_provincial='" + distribution_provincial + '\'' +
                ", distribution_city='" + distribution_city + '\'' +
                ", distribution_county='" + distribution_county + '\'' +
                '}';
    }
}
