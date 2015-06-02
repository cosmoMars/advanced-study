package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum Religion {

    Christian("基督教"),

    Catholicism("天主教"),

    None("无");

    private String name;

    Religion(String name) {
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
