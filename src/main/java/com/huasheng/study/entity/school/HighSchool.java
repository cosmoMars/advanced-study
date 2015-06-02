package com.huasheng.study.entity.school;

import com.huasheng.study.entity.State;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mars on 15/5/13.
 */
@Entity
@Table
@Audited
public class HighSchool extends AbstractPersistable<Long> {

    /**
     * 标题
     */
    private String title;

    /**
     * 英语标题
     */
    private String titleEn;

    /**
     * 图片
     */
    private String imagePath;

    /**
     * 位置
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private State state;

    /**
     * 网址
     */
    private String website;

    /**
     * 描述
     */
    @Column(columnDefinition = "TEXT")
    private String description;

    /**
     * ap课程
     */
    private int APCourse;

    /**
     * ib课程
     */
    private int IBCourse;

    /**
     * 宗教
     */
    private Religion religion;

    /**
     * 寄宿方式
     */
    private Residential residential;

    /**
     * 性别
     */
    private Gender gender;

    /**
     * 学费
     */
    private int expenses;

    /**
     * 年纪
     */
    private Grade grade;

    /**
     * 成立时间
     */
    @Temporal(TemporalType.DATE)
    private Date establishDate;


    private boolean acceptToefl;

    /**
     * 托福最低分
     */
    private double minToefl;

    /**
     * 托福最高分
     */
    private double maxToefl;

    private boolean acceptSlep;

    /**
     * slep最低分
     */
    private double minSlep;

    /**
     * slep最高分
     */
    private double maxSlep;

    private boolean acceptItep;

    /**
     * itep最低分
     */
    private double minItep;

    /**
     * itep最高分
     */
    private double maxItep;


    private boolean ssatSat;

    /**
     * sat平均分
     */
    private int averageSat;

    /**
     * 国际生比例
     */
    private double internationalStudentRatio;

    /**
     * 特长
     */
    private String speciality;

    /**
     * 学校人数
     */
    private int schoolPopulation;

    /**
     * 点击数
     */
    private int clicks;

    private String agencyReviews;

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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAPCourse() {
        return APCourse;
    }

    public void setAPCourse(int APCourse) {
        this.APCourse = APCourse;
    }

    public int getIBCourse() {
        return IBCourse;
    }

    public void setIBCourse(int IBCourse) {
        this.IBCourse = IBCourse;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Residential getResidential() {
        return residential;
    }

    public void setResidential(Residential residential) {
        this.residential = residential;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public boolean isAcceptToefl() {
        return acceptToefl;
    }

    public void setAcceptToefl(boolean acceptToefl) {
        this.acceptToefl = acceptToefl;
    }

    public double getMinToefl() {
        return minToefl;
    }

    public void setMinToefl(double minToefl) {
        this.minToefl = minToefl;
    }

    public double getMaxToefl() {
        return maxToefl;
    }

    public void setMaxToefl(double maxToefl) {
        this.maxToefl = maxToefl;
    }

    public boolean isAcceptSlep() {
        return acceptSlep;
    }

    public void setAcceptSlep(boolean acceptSlep) {
        this.acceptSlep = acceptSlep;
    }

    public double getMinSlep() {
        return minSlep;
    }

    public void setMinSlep(double minSlep) {
        this.minSlep = minSlep;
    }

    public double getMaxSlep() {
        return maxSlep;
    }

    public void setMaxSlep(double maxSlep) {
        this.maxSlep = maxSlep;
    }

    public boolean isAcceptItep() {
        return acceptItep;
    }

    public void setAcceptItep(boolean acceptItep) {
        this.acceptItep = acceptItep;
    }

    public double getMinItep() {
        return minItep;
    }

    public void setMinItep(double minItep) {
        this.minItep = minItep;
    }

    public double getMaxItep() {
        return maxItep;
    }

    public void setMaxItep(double maxItep) {
        this.maxItep = maxItep;
    }

    public boolean isSsatSat() {
        return ssatSat;
    }

    public void setSsatSat(boolean ssatSat) {
        this.ssatSat = ssatSat;
    }

    public int getAverageSat() {
        return averageSat;
    }

    public void setAverageSat(int averageSat) {
        this.averageSat = averageSat;
    }

    public double getInternationalStudentRatio() {
        return internationalStudentRatio;
    }

    public void setInternationalStudentRatio(double internationalStudentRatio) {
        this.internationalStudentRatio = internationalStudentRatio;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSchoolPopulation() {
        return schoolPopulation;
    }

    public void setSchoolPopulation(int schoolPopulation) {
        this.schoolPopulation = schoolPopulation;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public String getAgencyReviews() {
        return agencyReviews;
    }

    public void setAgencyReviews(String agencyReviews) {
        this.agencyReviews = agencyReviews;
    }
}
