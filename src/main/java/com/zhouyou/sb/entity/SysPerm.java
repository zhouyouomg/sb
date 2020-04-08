package com.zhouyou.sb.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysPerm)实体类
 *
 * @author makejava
 * @since 2020-04-08 16:20:57
 */
public class SysPerm implements Serializable {
    private static final long serialVersionUID = -57917195544717376L;
    
    private String id;
    /**
    * 权限名称
    */
    private String permName;
    /**
    * 权限描述
    */
    private String permDesc;
    /**
    * 权限值
    */
    private String permValue;
    
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

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermDesc() {
        return permDesc;
    }

    public void setPermDesc(String permDesc) {
        this.permDesc = permDesc;
    }

    public String getPermValue() {
        return permValue;
    }

    public void setPermValue(String permValue) {
        this.permValue = permValue;
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