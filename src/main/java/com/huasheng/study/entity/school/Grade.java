package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum Grade {

    Six("六年级"),

    Seven("七年级"),

    Eight("八年级"),

    Nine("九年级"),

    Ten("十年级"),

    Eleven("十一年级"),

    Twelve("十二年级");

    private String name;

    Grade(String name) {
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
