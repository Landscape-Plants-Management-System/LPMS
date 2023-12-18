package com.lpms.pojo.Classification;

public class Environment {
    private Long environmentId;//生长环境ID，自增主键
    private String environmentName;//生长环境名称

    public Environment() {
    }

    public Environment(Long environmentId, String environmentName) {
        this.environmentId = environmentId;
        this.environmentName = environmentName;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "environmentId=" + environmentId +
                ", environmentName='" + environmentName + '\'' +
                '}';
    }

    public Long getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(Long environmentId) {
        this.environmentId = environmentId;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
}
