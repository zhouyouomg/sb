package com.zhouyou.sb.service.impl;

import com.zhouyou.sb.entity.SysPermissionInit;
import com.zhouyou.sb.mapper.SysPermissionInitMapper;
import com.zhouyou.sb.service.SysPermissionInitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysPermissionInit)表服务实现类
 *
 * @author makejava
 * @since 2020-04-10 14:02:47
 */
@Service("sysPermissionInitService")
public class SysPermissionInitServiceImpl implements SysPermissionInitService {
    @Resource
    private SysPermissionInitMapper sysPermissionInitMapper;

    @Override
    public List<SysPermissionInit> selectAllOrderBySort() {
        return sysPermissionInitMapper.selectAllOrderBySort();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPermissionInit queryById(String id) {
        return this.sysPermissionInitMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysPermissionInit> queryAllByLimit(int offset, int limit) {
        return this.sysPermissionInitMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysPermissionInit 实例对象
     * @return 实例对象
     */
    @Override
    public SysPermissionInit insert(SysPermissionInit sysPermissionInit) {
        this.sysPermissionInitMapper.insert(sysPermissionInit);
        return sysPermissionInit;
    }

    /**
     * 修改数据
     *
     * @param sysPermissionInit 实例对象
     * @return 实例对象
     */
    @Override
    public SysPermissionInit update(SysPermissionInit sysPermissionInit) {
        this.sysPermissionInitMapper.update(sysPermissionInit);
        return this.queryById(sysPermissionInit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysPermissionInitMapper.deleteById(id) > 0;
    }
}