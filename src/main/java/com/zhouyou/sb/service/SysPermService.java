package com.zhouyou.sb.service;

import com.zhouyou.sb.entity.SysPerm;
import java.util.List;

/**
 * (SysPerm)表服务接口
 *
 * @author makejava
 * @since 2020-04-08 16:20:57
 */
public interface SysPermService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPerm queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysPerm> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysPerm 实例对象
     * @return 实例对象
     */
    SysPerm insert(SysPerm sysPerm);

    /**
     * 修改数据
     *
     * @param sysPerm 实例对象
     * @return 实例对象
     */
    SysPerm update(SysPerm sysPerm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}