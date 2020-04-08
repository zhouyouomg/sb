package com.zhouyou.sb.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(SysRole)实体类
 *
 * @author makejava
 * @since 2020-04-08 16:21:12
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -14576150128353329L;
    /**
    * 角色名称
    */
    private String id;
    /**
    * 角色名称，用于显示
    */
    private String roleName;
    /**
    * 角色描述
    */
    private String roleDesc;
    /**
    * 角色值，用于权限判断
    */
    private String roleValue;
    
    private Date createTime;
    
    private Date updateTime;
    /**
    * 是否禁用
    */
    private Integer isDisable;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

}