package com.lpms.pojo;

public class Growth {
    private Long growth_id;//生长周期ID，自增主键
    private String growth_name;//生长周期名称

    public Growth() {
    }

    public Growth(Long growth_id, String growth_name) {
        this.growth_id = growth_id;
        this.growth_name = growth_name;
    }

    public Long getGrowth_id() {
        return growth_id;
    }

    public void setGrowth_id(Long growth_id) {
        this.growth_id = growth_id;
    }

    public String getGrowth_name() {
        return growth_name;
    }

    public void setGrowth_name(String growth_name) {
        this.growth_name = growth_name;
    }

    @Override
    public String toString() {
        return "Growth{" +
                "growth_id=" + growth_id +
                ", growth_name='" + growth_name + '\'' +
                '}';
    }
}
