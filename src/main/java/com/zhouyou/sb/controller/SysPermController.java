package com.zhouyou.sb.controller;

import com.zhouyou.sb.entity.SysPerm;
import com.zhouyou.sb.service.SysPermService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysPerm)表控制层
 *
 * @author makejava
 * @since 2020-04-08 16:20:57
 */
@RestController
@RequestMapping("sysPerm")
public class SysPermController {
    /**
     * 服务对象
     */
    @Resource
    private SysPermService sysPermService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysPerm selectOne(String id) {
        return this.sysPermService.queryById(id);
    }

}