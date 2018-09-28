package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.configure.WebConst;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther: dqsdc
 * @Date: 2018-09-27 14:54
 * @Description: 基础控制类，便于获取用户ID和IP地址
 */

public abstract class BaseController {

    String userId(HttpServletRequest request) {
        return getLoginUser(request);
    }
    String userIp(HttpServletRequest request) {
        return request.getRemoteAddr();
    }
    /**
     * 返回当前登录用户Id
     * @param request
     * @return
     */
    private String getLoginUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (null == session) {
            return null;
        }
        return (String) session.getAttribute(WebConst.SESSION_USER_KEY);
    }
}
