package com.zhouyou.sb.service.impl;

import com.zhouyou.sb.entity.UserRole;
import com.zhouyou.sb.mapper.UserRoleMapper;
import com.zhouyou.sb.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户角色关系表(UserRole)表服务实现类
 *
 * @author makejava
 * @since 2020-04-08 16:21:23
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<String> getRolesByUserId(String userId) {
        return userRoleMapper.getRolesByUserId(userId);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserRole queryById(String id) {
        return this.userRoleMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserRole> queryAllByLimit(int offset, int limit) {
        return this.userRoleMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    @Override
    public UserRole insert(UserRole userRole) {
        this.userRoleMapper.insert(userRole);
        return userRole;
    }

    /**
     * 修改数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    @Override
    public UserRole update(UserRole userRole) {
        this.userRoleMapper.update(userRole);
        return this.queryById(userRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.userRoleMapper.deleteById(id) > 0;
    }
}