package com.lpms.pojo;

public class Test {
    //有个表是test，这是它的po
    private Integer id;
    private String aa;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", aa='" + aa + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }
}
