package com.zhouyou.sb.entity;

import java.io.Serializable;

/**
 * (SysPermissionInit)实体类
 *
 * @author makejava
 * @since 2020-04-10 14:02:46
 */
public class SysPermissionInit implements Serializable {
    private static final long serialVersionUID = -78428692624864414L;
    
    private String id;
    /**
    * 程序对应url地址
    */
    private String url;
    /**
    * 对应shiro权限
    */
    private String permissionInit;
    /**
    * 排序
    */
    private Integer sort;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermissionInit() {
        return permissionInit;
    }

    public void setPermissionInit(String permissionInit) {
        this.permissionInit = permissionInit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}