package com.zhouyou.sb.service;


import java.util.Map;

/**
 * shiro 动态更新权限
 */
public interface ShiroService {

    Map<String, String> loadFilterChainDefinitions();

    /**
     * 动态修改权限
     */
    void updatePermission();
}
