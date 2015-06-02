package com.huasheng.study.entity.user;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mars on 15/5/4.
 */
//@Entity
//@Table(name = "sys_user")
public class User extends AbstractPersistable<Long> {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码备份
     */
    @Column(name = "passwork_bak")
    private String passwordBAK;

    /**
     * 手机
     */
    private String phone;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 自动连接
     */
    private boolean autoLock;

    /**
     * 自动删除
     */
    private boolean autoDelete;

    /**
     * 活跃邮箱
     */
    private boolean activateEmail;

    /**
     *
     */
    private boolean manage;

    /**
     * 登陆次数
     */
    private int loginCount;

    /**
     * 最后登陆ip
     */
    @Column(name = "last_ip4")
    private String lastIP4;

    /**
     * 最后登陆地区
     */
    @Column(name = "last_ip_region")
    private String lastIPRegion;

    /**
     * 最后登陆时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordBAK() {
        return passwordBAK;
    }

    public void setPasswordBAK(String passwordBAK) {
        this.passwordBAK = passwordBAK;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isActivateEmail() {
        return activateEmail;
    }

    public void setActivateEmail(boolean activateEmail) {
        this.activateEmail = activateEmail;
    }

    public boolean isManage() {
        return manage;
    }

    public void setManage(boolean manage) {
        this.manage = manage;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public String getLastIP4() {
        return lastIP4;
    }

    public void setLastIP4(String lastIP4) {
        this.lastIP4 = lastIP4;
    }

    public String getLastIPRegion() {
        return lastIPRegion;
    }

    public void setLastIPRegion(String lastIPRegion) {
        this.lastIPRegion = lastIPRegion;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}
