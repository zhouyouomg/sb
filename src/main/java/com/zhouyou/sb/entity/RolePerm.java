package com.zhouyou.sb.entity;

import java.io.Serializable;

/**
 * 角色权限表(RolePerm)实体类
 *
 * @author makejava
 * @since 2020-04-08 16:20:44
 */
public class RolePerm implements Serializable {
    private static final long serialVersionUID = 430633405887209142L;
    
    private String id;
    /**
    * 权限id
    */
    private String permId;
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

    public String getPermId() {
        return permId;
    }

    public void setPermId(String permId) {
        this.permId = permId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}