package com.lpms.pojo.disease;

public class Disease {
    private int disease_id;
    private String disease_name;
    private int method_id;
    private String method_name;
    private String drug_name;
    private double drug_dosage;
    private double drug_time;

    public int getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(int disease_id) {
        this.disease_id = disease_id;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public int getMethod_id() {
        return method_id;
    }

    public void setMethod_id(int method_id) {
        this.method_id = method_id;
    }

    public String getMethod_name() {
        return method_name;
    }

    public void setMethod_name(String method_name) {
        this.method_name = method_name;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public double getDrug_dosage() {
        return drug_dosage;
    }

    public void setDrug_dosage(double drug_dosage) {
        this.drug_dosage = drug_dosage;
    }

    public double getDrug_time() {
        return drug_time;
    }

    public void setDrug_time(double drug_time) {
        this.drug_time = drug_time;
    }

    @Override
    public String toString() {
        return "disease{" +
                "disease_id=" + disease_id +
                ", disease_name='" + disease_name + '\'' +
                ", method='" + method_name + '\'' +
                ", drug_name='" + drug_name + '\'' +
                ", drug_dosage=" + drug_dosage +
                ", drug_time=" + drug_time +
                '}';
    }
}
