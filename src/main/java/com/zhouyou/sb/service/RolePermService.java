package com.zhouyou.sb.service;

import com.zhouyou.sb.entity.RolePerm;
import java.util.List;

/**
 * 角色权限表(RolePerm)表服务接口
 *
 * @author makejava
 * @since 2020-04-08 16:20:45
 */
public interface RolePermService {

    List<String> getPermsByUserId(String userId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RolePerm queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RolePerm> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rolePerm 实例对象
     * @return 实例对象
     */
    RolePerm insert(RolePerm rolePerm);

    /**
     * 修改数据
     *
     * @param rolePerm 实例对象
     * @return 实例对象
     */
    RolePerm update(RolePerm rolePerm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}