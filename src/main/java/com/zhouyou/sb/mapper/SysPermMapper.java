package com.zhouyou.sb.mapper;

import com.zhouyou.sb.entity.SysPerm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysPerm)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-08 16:20:57
 */
public interface SysPermMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysPerm queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysPerm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysPerm 实例对象
     * @return 对象列表
     */
    List<SysPerm> queryAll(SysPerm sysPerm);

    /**
     * 新增数据
     *
     * @param sysPerm 实例对象
     * @return 影响行数
     */
    int insert(SysPerm sysPerm);

    /**
     * 修改数据
     *
     * @param sysPerm 实例对象
     * @return 影响行数
     */
    int update(SysPerm sysPerm);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}