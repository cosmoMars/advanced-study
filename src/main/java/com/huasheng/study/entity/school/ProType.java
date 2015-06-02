package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/13.
 */
public enum ProType {

    /**
     * 专业
     */
    Professional("专业"),

    /**
     * 系
     */
    Faculty("系"),

    /**
     * 院
     */
    Department("院");

    ProType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
