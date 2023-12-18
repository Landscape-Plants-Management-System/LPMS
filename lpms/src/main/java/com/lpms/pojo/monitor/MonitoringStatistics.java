package com.lpms.pojo.monitor;

public class MonitoringStatistics {
    private Float avgStemGrowth;
    private Float maxStemGrowth;
    private Float minStemGrowth;
    private Float avgFruitGrowth;
    private Float maxFruitGrowth;
    private Float minFruitGrowth;
    private Float avgCanopyTemperature;
    private Float maxCanopyTemperature;
    private Float minCanopyTemperature;
    private Float avgLeafTemperature;
    private Float maxLeafTemperature;
    private Float minLeafTemperature;

    @Override
    public String toString() {
        return "MonitoringStatistics{" +
                "avgStemGrowth=" + avgStemGrowth +
                ", maxStemGrowth=" + maxStemGrowth +
                ", minStemGrowth=" + minStemGrowth +
                ", avgFruitGrowth=" + avgFruitGrowth +
                ", maxFruitGrowth=" + maxFruitGrowth +
                ", minFruitGrowth=" + minFruitGrowth +
                ", avgCanopyTemperature=" + avgCanopyTemperature +
                ", maxCanopyTemperature=" + maxCanopyTemperature +
                ", minCanopyTemperature=" + minCanopyTemperature +
                ", avgLeafTemperature=" + avgLeafTemperature +
                ", maxLeafTemperature=" + maxLeafTemperature +
                ", minLeafTemperature=" + minLeafTemperature +
                '}';
    }

    public Float getAvgStemGrowth() {
        return avgStemGrowth;
    }

    public void setAvgStemGrowth(Float avgStemGrowth) {
        this.avgStemGrowth = avgStemGrowth;
    }

    public Float getMaxStemGrowth() {
        return maxStemGrowth;
    }

    public void setMaxStemGrowth(Float maxStemGrowth) {
        this.maxStemGrowth = maxStemGrowth;
    }

    public Float getMinStemGrowth() {
        return minStemGrowth;
    }

    public void setMinStemGrowth(Float minStemGrowth) {
        this.minStemGrowth = minStemGrowth;
    }

    public Float getAvgFruitGrowth() {
        return avgFruitGrowth;
    }

    public void setAvgFruitGrowth(Float avgFruitGrowth) {
        this.avgFruitGrowth = avgFruitGrowth;
    }

    public Float getMaxFruitGrowth() {
        return maxFruitGrowth;
    }

    public void setMaxFruitGrowth(Float maxFruitGrowth) {
        this.maxFruitGrowth = maxFruitGrowth;
    }

    public Float getMinFruitGrowth() {
        return minFruitGrowth;
    }

    public void setMinFruitGrowth(Float minFruitGrowth) {
        this.minFruitGrowth = minFruitGrowth;
    }

    public Float getAvgCanopyTemperature() {
        return avgCanopyTemperature;
    }

    public void setAvgCanopyTemperature(Float avgCanopyTemperature) {
        this.avgCanopyTemperature = avgCanopyTemperature;
    }

    public Float getMaxCanopyTemperature() {
        return maxCanopyTemperature;
    }

    public void setMaxCanopyTemperature(Float maxCanopyTemperature) {
        this.maxCanopyTemperature = maxCanopyTemperature;
    }

    public Float getMinCanopyTemperature() {
        return minCanopyTemperature;
    }

    public void setMinCanopyTemperature(Float minCanopyTemperature) {
        this.minCanopyTemperature = minCanopyTemperature;
    }

    public Float getAvgLeafTemperature() {
        return avgLeafTemperature;
    }

    public void setAvgLeafTemperature(Float avgLeafTemperature) {
        this.avgLeafTemperature = avgLeafTemperature;
    }

    public Float getMaxLeafTemperature() {
        return maxLeafTemperature;
    }

    public void setMaxLeafTemperature(Float maxLeafTemperature) {
        this.maxLeafTemperature = maxLeafTemperature;
    }

    public Float getMinLeafTemperature() {
        return minLeafTemperature;
    }

    public void setMinLeafTemperature(Float minLeafTemperature) {
        this.minLeafTemperature = minLeafTemperature;
    }
}
