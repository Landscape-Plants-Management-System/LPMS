package com.lpms.pojo.plant;

public class Plant_Count {
    private String speciesName;
    private  int number;

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Plant_Count{" +
                "speciesName='" + speciesName + '\'' +
                ", number=" + number +
                '}';
    }
}
