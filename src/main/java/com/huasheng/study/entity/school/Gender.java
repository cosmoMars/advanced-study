package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum Gender {

    /**
     * 男校
     */
    Male("男校"),

    /**
     * 女校
     */
    Female("女校"),

    /**
     * 男女混校
     */
    Coeducation("男女混校");

    Gender(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
