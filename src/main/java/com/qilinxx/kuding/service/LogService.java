package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Log;

import java.util.List;

/**
 * @Auther: LJM
 * @Date: 2018-09-27 11:45
 * @Description: 日志操作服务类
 */
public interface LogService {
    void insertLog(Log log);

    void insertLog(String action,String userId,String Ip);

    void insertLog(String action, String userId, String ip,String sid,String tid);

    List<Log>  getAllLog();
}
