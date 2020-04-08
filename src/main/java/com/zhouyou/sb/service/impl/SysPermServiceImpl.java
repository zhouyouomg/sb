package com.zhouyou.sb.service.impl;

import com.zhouyou.sb.entity.SysPerm;
import com.zhouyou.sb.mapper.SysPermMapper;
import com.zhouyou.sb.service.SysPermService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysPerm)表服务实现类
 *
 * @author makejava
 * @since 2020-04-08 16:20:57
 */
@Service("sysPermService")
public class SysPermServiceImpl implements SysPermService {
    @Resource
    private SysPermMapper sysPermMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPerm queryById(String id) {
        return this.sysPermMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysPerm> queryAllByLimit(int offset, int limit) {
        return this.sysPermMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysPerm 实例对象
     * @return 实例对象
     */
    @Override
    public SysPerm insert(SysPerm sysPerm) {
        this.sysPermMapper.insert(sysPerm);
        return sysPerm;
    }

    /**
     * 修改数据
     *
     * @param sysPerm 实例对象
     * @return 实例对象
     */
    @Override
    public SysPerm update(SysPerm sysPerm) {
        this.sysPermMapper.update(sysPerm);
        return this.queryById(sysPerm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysPermMapper.deleteById(id) > 0;
    }
}