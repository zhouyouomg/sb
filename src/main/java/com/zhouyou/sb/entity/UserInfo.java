package com.zhouyou.sb.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Set;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2020-04-07 11:31:20
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 924514363032697995L;

    @Id
    private String id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    @Transient
    private Set<String> roles;

    /**
     * 用户所有权限值，用于shiro做资源权限的判断
     */
    @Transient
    private Set<String> perms;


    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfo() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPerms() {
        return perms;
    }

    public void setPerms(Set<String> perms) {
        this.perms = perms;
    }
}