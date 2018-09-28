package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.LogMapper;
import com.qilinxx.kuding.domain.model.Log;
import com.qilinxx.kuding.service.LogService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: LJM
 * @Date: 2018-09-27 11:46
 * @Description: 日志打印服务类
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    @Override
    public void insertLog(Log log) {
        logMapper.insert(log);
    }

    /**
     * 保存一条日志（与学生和老师无关的操作）
     * @param action 具体操作名称
     * @param userId 当前登录的用户id
     * @param ip 当前用户远端ip
     */
    @Override
    public void insertLog(String action, String userId, String ip) {
        Log log = new Log();
        log.setlId(UUID.UU32());
        log.setlAction(action);
        log.setlUserId(userId);
        log.setlIp(ip);
        log.setlCreateTime((long) DateKit.getCurrentUnixTime());
        log.setlState("0");
        logMapper.insert(log);
    }

    /**
     * 保存一条日志（与老师和学生有关，传入对应的sid和tid）
     * @param action 具体操作名称
     * @param userId 当前登录的用户id
     * @param ip 当前用户远端ip
     * @param sid 相关学生id
     * @param tid 相关教师id
     */

    @Override
    public void insertLog(String action, String userId, String ip, String sid, String tid) {
        Log log = new Log();
        log.setlId(UUID.UU32());
        log.setlAction(action);
        log.setlUserId(userId);
        log.setlIp(ip);
        log.setlCreateTime((long) DateKit.getCurrentUnixTime());
        log.setlState("0");
        log.setlSid(sid);
        log.setlTid(tid);
        logMapper.insert(log);
    }
}
