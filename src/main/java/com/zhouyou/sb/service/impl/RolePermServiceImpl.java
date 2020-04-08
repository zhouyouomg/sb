package com.zhouyou.sb.service.impl;

import com.zhouyou.sb.entity.RolePerm;
import com.zhouyou.sb.mapper.RolePermMapper;
import com.zhouyou.sb.service.RolePermService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色权限表(RolePerm)表服务实现类
 *
 * @author makejava
 * @since 2020-04-08 16:20:45
 */
@Service("rolePermService")
public class RolePermServiceImpl implements RolePermService {
    @Resource
    private RolePermMapper rolePermMapper;

    @Override
    public List<String> getPermsByUserId(String userId) {
        return rolePermMapper.getPermsByUserId(userId);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RolePerm queryById(String id) {
        return this.rolePermMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RolePerm> queryAllByLimit(int offset, int limit) {
        return this.rolePermMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rolePerm 实例对象
     * @return 实例对象
     */
    @Override
    public RolePerm insert(RolePerm rolePerm) {
        this.rolePermMapper.insert(rolePerm);
        return rolePerm;
    }

    /**
     * 修改数据
     *
     * @param rolePerm 实例对象
     * @return 实例对象
     */
    @Override
    public RolePerm update(RolePerm rolePerm) {
        this.rolePermMapper.update(rolePerm);
        return this.queryById(rolePerm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.rolePermMapper.deleteById(id) > 0;
    }
}