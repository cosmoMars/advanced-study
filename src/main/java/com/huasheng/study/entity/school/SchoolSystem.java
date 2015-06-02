package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum SchoolSystem {

    CollegeDegree("大专"),

    BachelorDegree("本科"),

    MasterDegree("硕士"),

    DoctorDegree("博士");


    SchoolSystem(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
