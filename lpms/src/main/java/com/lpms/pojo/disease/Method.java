package com.lpms.pojo.disease;

public class Method {
    private int methodId;
    private String methodName;
    private String drugName;
    private double drugDosage;
    private double drugTime;

    public int getMethodId() {
        return methodId;
    }

    public void setMethodId(int methodId) {
        this.methodId = methodId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(double drugDosage) {
        this.drugDosage = drugDosage;
    }

    public double getDrugTime() {
        return drugTime;
    }

    public void setDrugTime(double drugTime) {
        this.drugTime = drugTime;
    }

    @Override
    public String toString() {
        return "Method{" +
                "methodId=" + methodId +
                ", methodName='" + methodName + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugDosage=" + drugDosage +
                ", drugTime=" + drugTime +
                '}';
    }
}
