package com.zhouyou.sb.service.impl;

import com.zhouyou.sb.core.universal.AbstractService;
import com.zhouyou.sb.entity.SystemLog;
import com.zhouyou.sb.mapper.SystemLogMapper;
import com.zhouyou.sb.service.SystemLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    SystemLogMapper systemLogMapper;

    @Override
    public Integer insertByBatch(List<SystemLog> list) {
        return systemLogMapper.insertByBatch(list);
    }
}
