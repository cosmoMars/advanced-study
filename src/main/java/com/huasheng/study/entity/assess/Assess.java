package com.huasheng.study.entity.assess;

import com.huasheng.study.entity.article.Article;
import com.huasheng.study.entity.article.ArticleType;
import com.huasheng.study.entity.user.User;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mars on 15/5/4.
 */
@Entity
@Table(name = "lan_assess")
public class Assess extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

    private String schoolName;

    private String name;

    @Enumerated
    private Sex sex;

    public enum Sex{
        Male, Female
    }

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pro pro;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    private String tel;

    private String email;

    private String qq;

    private String subject;

    @Enumerated
    private Type type;

    public enum Type {

    }

    @Enumerated
    private SchoolType schoolType;

    public enum SchoolType {

    }

    private String achievement;

    private String workExperience;

    private String toefl;

    private String ielts;

    @Column(name = "graduate_gre")
    private String graduateGRE;

    @Column(name = "graduate_gmat")
    private String graduateGMAT;

    @Column(name = "graduate_lsat")
    private String graduateLSAT;

    @Column(name = "bachelor_sat")
    private String bachelorSAT;

    @Column(name = "senior_ssat")
    private String seniorSSAT;

    @Column(name = "senior_slep")
    private String seniorSLEP;

    @Enumerated
    private ArticleType articleType;

    private boolean read;

    private boolean sendEmail;

    private String downLoadFile;

    private String info;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;


}
