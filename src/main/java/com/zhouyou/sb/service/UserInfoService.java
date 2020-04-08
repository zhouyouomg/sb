package com.zhouyou.sb.service;

import com.github.pagehelper.PageInfo;
import com.zhouyou.sb.core.universal.Service;
import com.zhouyou.sb.entity.UserInfo;
import java.util.List;

/**
 * (UserInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-07 11:31:23
 */
public interface UserInfoService extends Service<UserInfo> {



    PageInfo<UserInfo> selectQuery(Integer page, Integer size,String userName);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfo queryById(String id);


}