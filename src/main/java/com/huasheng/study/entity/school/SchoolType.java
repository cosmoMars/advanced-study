package com.huasheng.study.entity.school;

/**
 * Created by mars on 15/5/12.
 */
public enum SchoolType {

    ARTS("文理学院"),

    CommunityCollege("社区学院"),

    ComprehensiveCollege("综合性学院");

    private String type;

    SchoolType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

}
