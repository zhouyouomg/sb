package com.zhouyou.sb.mapper;

import com.zhouyou.sb.entity.SysPermissionInit;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysPermissionInit)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-10 14:02:46
 */
public interface SysPermissionInitMapper {


    List<SysPermissionInit> selectAllOrderBySort();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPermissionInit queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysPermissionInit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysPermissionInit 实例对象
     * @return 对象列表
     */
    List<SysPermissionInit> queryAll(SysPermissionInit sysPermissionInit);

    /**
     * 新增数据
     *
     * @param sysPermissionInit 实例对象
     * @return 影响行数
     */
    int insert(SysPermissionInit sysPermissionInit);

    /**
     * 修改数据
     *
     * @param sysPermissionInit 实例对象
     * @return 影响行数
     */
    int update(SysPermissionInit sysPermissionInit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}