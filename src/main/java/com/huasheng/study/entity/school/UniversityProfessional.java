package com.huasheng.study.entity.school;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by mars on 15/5/13.
 */
//@Entity
//@Table(name = "lan_university_professional")
public class UniversityProfessional extends AbstractPersistable<Long> {

    /**
     * 标题
     */
    private String title;

    /**
     * 英语标题
     */
    private String titleEn;

    @ManyToOne(fetch = FetchType.LAZY)
    private UniversityProfessional parent;

    /**
     *
     */
    private int depth;

    /**
     * 描述
     */
    @Column(columnDefinition = "TEXT")
    private String description;

    /**
     * 英语标题
     */
    @Column(columnDefinition = "TEXT")
    private String descriptionEn;

    /**
     * 图片
     */
    private String imagePath;

    /**
     * 自动上锁
     */
    private boolean autoLock;

    /**
     * 自动删除
     */
    private boolean autoDelete;

    /**
     * 顺序
     */
    private int sort;

    /**
     * 类型名称
     */
    private String typeName;

    @Enumerated
    public ProType proType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public UniversityProfessional getParent() {
        return parent;
    }

    public void setParent(UniversityProfessional parent) {
        this.parent = parent;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isAutoLock() {
        return autoLock;
    }

    public void setAutoLock(boolean autoLock) {
        this.autoLock = autoLock;
    }

    public boolean isAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ProType getProType() {
        return proType;
    }

    public void setProType(ProType proType) {
        this.proType = proType;
    }
}
