package com.lpms.pojo.Classification;

public class Environment {
    private Long environment_id;//生长环境ID，自增主键
    private String environment_name;//生长环境名称

    public Environment() {
    }

    public Environment(Long environment_id, String environment_name) {
        this.environment_id = environment_id;
        this.environment_name = environment_name;
    }

    public Long getEnvironment_id() {
        return environment_id;
    }

    public void setEnvironment_id(Long environment_id) {
        this.environment_id = environment_id;
    }

    public String getEnvironment_name() {
        return environment_name;
    }

    public void setEnvironment_name(String environment_name) {
        this.environment_name = environment_name;
    }

    @Override
    public String toString() {
        return "environment{" +
                "environment_id=" + environment_id +
                ", environment_name='" + environment_name + '\'' +
                '}';
    }
}
