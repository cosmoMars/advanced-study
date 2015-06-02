package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum SchoolPayType {

    PrivateUniversities("私立大学"),

    PublicUniversities("公立大学");


    SchoolPayType(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


