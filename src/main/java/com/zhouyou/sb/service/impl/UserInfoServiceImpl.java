package com.zhouyou.sb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouyou.sb.core.ServiceException;
import com.zhouyou.sb.core.universal.AbstractService;
import com.zhouyou.sb.entity.UserInfo;
import com.zhouyou.sb.mapper.db1.UserInfoMapper;
import com.zhouyou.sb.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-07 11:31:23
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {


    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
        public PageInfo<UserInfo> selectQuery(Integer page, Integer size, String userName) {

        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageHelper.startPage(page, size);
        List<UserInfo> userInfoList = userInfoMapper.selectQuery(userName);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserInfo queryById(String id) {
        UserInfo userInfo = this.selectById(id);
        if(userInfo == null){
            throw new ServiceException("没有找到该用户",-1);
        }
        return userInfo;
    }

}