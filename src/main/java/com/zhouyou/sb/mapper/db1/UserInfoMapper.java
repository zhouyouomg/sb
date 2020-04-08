package com.zhouyou.sb.mapper.db1;

import com.zhouyou.sb.core.universal.Mapper;
import com.zhouyou.sb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-07 11:31:22
 */
public interface UserInfoMapper extends Mapper<UserInfo> {


    List<UserInfo> selectQuery(String userName);


}