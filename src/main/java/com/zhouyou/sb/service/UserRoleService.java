package com.zhouyou.sb.service;

import com.zhouyou.sb.entity.UserRole;
import java.util.List;

/**
 * 用户角色关系表(UserRole)表服务接口
 *
 * @author makejava
 * @since 2020-04-08 16:21:23
 */
public interface UserRoleService {


    List<String> getRolesByUserId(String userId);
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserRole queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    UserRole insert(UserRole userRole);

    /**
     * 修改数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    UserRole update(UserRole userRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}