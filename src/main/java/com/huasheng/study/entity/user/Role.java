package com.huasheng.study.entity.user;

import com.huasheng.core.entity.AbstractBaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mars on 15/5/4.
 */
@Entity
@Table(name = "sys_role")
public class Role extends AbstractBaseEntity<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
