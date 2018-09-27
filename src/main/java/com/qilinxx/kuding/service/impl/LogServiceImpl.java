package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.LogMapper;
import com.qilinxx.kuding.domain.model.Log;
import com.qilinxx.kuding.service.LogService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: dqsdc
 * @Date: 2018-09-27 11:46
 * @Description:
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    @Override
    public void insertLog(Log log) {
        logMapper.insert(log);
    }

    @Override
    public void insertLog(String action, String userId, String ip) {
        Log log=new Log();
        log.setlId(UUID.UU32());
        log.setlAction(action);
        log.setlUserId(userId);
        log.setlIp(ip);
        log.setlCreateTime((long) DateKit.getCurrentUnixTime());
        logMapper.insert(log);
    }
}
