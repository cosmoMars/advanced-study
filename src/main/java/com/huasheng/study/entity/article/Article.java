package com.huasheng.study.entity.article;

import com.huasheng.study.entity.user.Role;
import com.huasheng.study.entity.user.Tag;
import com.huasheng.study.entity.user.User;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mars on 15/5/4.
 * 文章
 */
@Entity
@Table(name = "lan_article")
public class Article extends AbstractPersistable<Long> {

    /**
     * 关键字
     */
    private String keyWords;

    /**
     * 描述
     */
    private String description;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 总结
     */
    private String summary;

    /**
     * 详情
     */
    @Column(columnDefinition = "LONGTEXT")
    private String details;

    /**
     * url
     */
    private String url;

    /**
     * 是否链接
     */
    private boolean isLink;

    /**
     * 自动连接
     */
    private boolean autoLock;

    /**
     * 自动删除
     */
    private boolean autoDelete;

    /**
     * 点击量
     */
    private int clicks;

    /**
     *
     */
    private int tClicks;

    /**
     *
     */
    private int support;

    /**
     *
     */
    private int oppose;

    /**
     * 用户
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    /**
     * 来源
     */
    private String source;

    /**
     * 角色
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Role role;

    /**
     * 标签
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Tag tag;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;


    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isLink() {
        return isLink;
    }

    public void setIsLink(boolean isLink) {
        this.isLink = isLink;
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

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int gettClicks() {
        return tClicks;
    }

    public void settClicks(int tClicks) {
        this.tClicks = tClicks;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        this.support = support;
    }

    public int getOppose() {
        return oppose;
    }

    public void setOppose(int oppose) {
        this.oppose = oppose;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
