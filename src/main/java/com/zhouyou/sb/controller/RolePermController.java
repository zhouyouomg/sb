package com.zhouyou.sb.controller;

import com.zhouyou.sb.entity.RolePerm;
import com.zhouyou.sb.service.RolePermService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色权限表(RolePerm)表控制层
 *
 * @author makejava
 * @since 2020-04-08 16:20:45
 */
@RestController
@RequestMapping("rolePerm")
public class RolePermController {
    /**
     * 服务对象
     */
    @Resource
    private RolePermService rolePermService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RolePerm selectOne(String id) {
        return this.rolePermService.queryById(id);
    }

}