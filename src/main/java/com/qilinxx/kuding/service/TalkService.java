package com.qilinxx.kuding.service;

import java.io.UnsupportedEncodingException;

/**
 * @Auther: ljm
 * @Date: 2018-09-07 17:14
 * @Description: 调用第三方接口，生成直播url
 */
public interface TalkService {

    String createMeeting(int people, int time) throws UnsupportedEncodingException;

}
