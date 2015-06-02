package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum Residential {

    DayStudents("走读"),

    Boarder("寄宿"),

    Both("走读寄宿");

    private String name;

    Residential(String name) {
        this.name = name;
    }

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
