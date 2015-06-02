package com.huasheng.study.entity;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mars on 15/6/1.
 */
@Entity
@Table
@Audited
public class State extends AbstractPersistable<Long> {

    /**
     * 州名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
