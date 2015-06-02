package com.huasheng.study.entity.user;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Created by mars on 15/5/4.
 */
//@Entity
//@Table(name = "sys_role")
public class Role extends AbstractPersistable<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
