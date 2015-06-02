package com.huasheng.study.entity.assess;

import com.huasheng.study.entity.article.Article;
import com.huasheng.study.entity.user.User;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mars on 15/5/4.
 */
//@Entity
//@Table(name = "lan_access_form")
public class AssessForm extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 学历
     */
    private String educationalBackgroud;

    /**
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Pro pro;

    /**
     * 城市
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    /**
     * 电话
     */
    private String tel;

    /**
     * qq
     */
    private String qq;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 信息
     */
    private String info;

    /**
     * ip
     */
    private String ip;

    /**
     * 已读
     */
    private boolean read;

    /**
     * 已发邮件
     */
    private boolean sendEmail;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

}
