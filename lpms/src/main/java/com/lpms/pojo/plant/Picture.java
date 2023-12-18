package com.lpms.pojo.plant;

public class Picture {
    private int picture_id;
    private int plant_id;

    private int user_id;

    private String pic_path;

    private String describe;

    public int getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(int picture_id) {
        this.picture_id = picture_id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
