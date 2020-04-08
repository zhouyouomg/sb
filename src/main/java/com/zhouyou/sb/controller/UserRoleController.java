package com.zhouyou.sb.controller;

import com.zhouyou.sb.entity.UserRole;
import com.zhouyou.sb.service.UserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户角色关系表(UserRole)表控制层
 *
 * @author makejava
 * @since 2020-04-08 16:21:23
 */
@RestController
@RequestMapping("userRole")
public class UserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserRole selectOne(String id) {
        return this.userRoleService.queryById(id);
    }

}