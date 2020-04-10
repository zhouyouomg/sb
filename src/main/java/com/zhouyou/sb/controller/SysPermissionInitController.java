package com.zhouyou.sb.controller;

import com.zhouyou.sb.entity.SysPermissionInit;
import com.zhouyou.sb.service.SysPermissionInitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysPermissionInit)表控制层
 *
 * @author makejava
 * @since 2020-04-10 14:02:47
 */
@RestController
@RequestMapping("sysPermissionInit")
public class SysPermissionInitController {
    /**
     * 服务对象
     */
    @Resource
    private SysPermissionInitService sysPermissionInitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysPermissionInit selectOne(String id) {
        return this.sysPermissionInitService.queryById(id);
    }

}