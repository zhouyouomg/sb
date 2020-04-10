package com.zhouyou.sb.service;

import com.zhouyou.sb.core.universal.Service;
import com.zhouyou.sb.entity.SystemLog;

import java.util.List;

public interface SystemLogService extends Service<SystemLog> {

    Integer insertByBatch(List<SystemLog> list);
}
