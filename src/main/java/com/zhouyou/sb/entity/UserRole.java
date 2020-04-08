package com.zhouyou.sb.entity;

import java.io.Serializable;

/**
 * 用户角色关系表(UserRole)实体类
 *
 * @author makejava
 * @since 2020-04-08 16:21:23
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = -27032663659283494L;
    
    private String id;
    /**
    * 用户ID
    */
    private String userId;
    /**
    * 角色id
    */
    private String roleId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}