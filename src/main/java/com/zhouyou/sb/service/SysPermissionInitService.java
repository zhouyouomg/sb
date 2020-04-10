package com.zhouyou.sb.service;

import com.zhouyou.sb.entity.SysPermissionInit;
import java.util.List;

/**
 * (SysPermissionInit)表服务接口
 *
 * @author makejava
 * @since 2020-04-10 14:02:47
 */
public interface SysPermissionInitService {


    List<SysPermissionInit> selectAllOrderBySort();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPermissionInit queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysPermissionInit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysPermissionInit 实例对象
     * @return 实例对象
     */
    SysPermissionInit insert(SysPermissionInit sysPermissionInit);

    /**
     * 修改数据
     *
     * @param sysPermissionInit 实例对象
     * @return 实例对象
     */
    SysPermissionInit update(SysPermissionInit sysPermissionInit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}