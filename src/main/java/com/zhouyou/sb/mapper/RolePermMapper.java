package com.zhouyou.sb.mapper;

import com.zhouyou.sb.entity.RolePerm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 角色权限表(RolePerm)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-08 16:20:44
 */
public interface RolePermMapper {

    List<String> getPermsByUserId(String userId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RolePerm queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RolePerm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param rolePerm 实例对象
     * @return 对象列表
     */
    List<RolePerm> queryAll(RolePerm rolePerm);

    /**
     * 新增数据
     *
     * @param rolePerm 实例对象
     * @return 影响行数
     */
    int insert(RolePerm rolePerm);

    /**
     * 修改数据
     *
     * @param rolePerm 实例对象
     * @return 影响行数
     */
    int update(RolePerm rolePerm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}