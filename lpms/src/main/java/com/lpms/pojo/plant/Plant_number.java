package com.lpms.pojo.plant;

public class Plant_number {
   private String plantName;
   private   long number;

    public String getPlant_name() {
        return plantName;
    }

    public void setPlant_name(String plantName) {
        this.plantName = plantName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Plant_number{" +
                "plantName='" + plantName + '\'' +
                ", number=" + number +
                '}';
    }
}
