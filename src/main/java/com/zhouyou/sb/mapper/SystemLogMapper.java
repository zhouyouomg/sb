package com.zhouyou.sb.mapper;

import com.zhouyou.sb.core.universal.Mapper;
import com.zhouyou.sb.entity.SystemLog;

import java.util.List;

public interface SystemLogMapper extends Mapper<SystemLog> {

    Integer insertByBatch(List<SystemLog> list);
}