package com.qilinxx.kuding.service;

/**
 * @Auther: ljm
 * @Date: 2018-09-07 17:14
 * @Description: 调用第三方接口，生成直播url
 */
public interface TalkService {

    /**
     * 在未来的一个时间点创建上课会话,若start为null，则立即开始
     *
     * @param people   会话人数
     * @param timeLong 会话时长
     * @param start    会话开始时间戳
     * @return 返回的json
     */
    String createMeetingOn(Integer people, Integer timeLong, Integer start);

}
