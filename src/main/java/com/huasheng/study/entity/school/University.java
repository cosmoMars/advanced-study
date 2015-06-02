package com.huasheng.study.entity.school;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by mars on 15/5/12.
 */
//@Entity
//@Table(name = "lan_university")
public class University extends AbstractPersistable<Long> {


    /**
     * 标题
     */
    private String title;

    /**
     * 英语标题
     */
    private String titleEn;

    /**
     * 大学类型 0 文理学院 1 社区学院 2 综合性学院
     */
    @Enumerated
    public SchoolType schoolType;

    /**
     * 图片
     */
    private String imagePath;

    /**
     * 位置
     */
    private String location;

    /**
     * 支付方式 0 私立大学 1 公立大学
     */
    @Enumerated
    private SchoolPayType schoolPayType;

    /**
     * 学校建立时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date schoolDate;

    /**
     * 网址
     */
    private String website;

    /**
     * 描述
     */
    @Column(columnDefinition = "TEXT")
    private String descirption;

    /**
     *
     */
    private int overallRank;

    /**
     * 学费
     */
    private String expenses;

    /**
     * 结束时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "A1")
    private String A1;

    @Column(name = "AA1")
    private String AA1;

    @Column(name = "A2")
    private String A2;

    @Column(name = "AA2")
    private String AA2;

    @Column(name = "A3")
    private String A3;

    @Column(name = "AA3")
    private String AA3;

    @Column(name = "A4")
    private String A4;

    @Column(name = "AA4")
    private String AA4;

    @Column(name = "A5")
    private String A5;

    @Column(name = "AA5")
    private String AA5;

    private boolean autoLock;

    private boolean autoDelete;

    /**
     * 开始时间
     */
    @Temporal(TemporalType.DATE)
    private Date createDate;

    /**
     *
     */
    private Set<SchoolSystem> schoolSystem;

    private int clicks;

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

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SchoolPayType getSchoolPayType() {
        return schoolPayType;
    }

    public void setSchoolPayType(SchoolPayType schoolPayType) {
        this.schoolPayType = schoolPayType;
    }

    public Date getSchoolDate() {
        return schoolDate;
    }

    public void setSchoolDate(Date schoolDate) {
        this.schoolDate = schoolDate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    public int getOverallRank() {
        return overallRank;
    }

    public void setOverallRank(int overallRank) {
        this.overallRank = overallRank;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    public String getAA1() {
        return AA1;
    }

    public void setAA1(String AA1) {
        this.AA1 = AA1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String a2) {
        A2 = a2;
    }

    public String getAA2() {
        return AA2;
    }

    public void setAA2(String AA2) {
        this.AA2 = AA2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String a3) {
        A3 = a3;
    }

    public String getAA3() {
        return AA3;
    }

    public void setAA3(String AA3) {
        this.AA3 = AA3;
    }

    public String getA4() {
        return A4;
    }

    public void setA4(String a4) {
        A4 = a4;
    }

    public String getAA4() {
        return AA4;
    }

    public void setAA4(String AA4) {
        this.AA4 = AA4;
    }

    public String getA5() {
        return A5;
    }

    public void setA5(String a5) {
        A5 = a5;
    }

    public String getAA5() {
        return AA5;
    }

    public void setAA5(String AA5) {
        this.AA5 = AA5;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<SchoolSystem> getSchoolSystem() {
        return schoolSystem;
    }

    public void setSchoolSystem(Set<SchoolSystem> schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}
