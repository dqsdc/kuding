package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.service.TalkService;
import com.qilinxx.kuding.util.UrlConnectedUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * @Auther: ljm
 * @Date: 2018-09-13 16:14
 * @Description: 调用第三方接口，生成直播url
 */
@Repository
public class TalkServiceImpl implements TalkService {

    @Value("${http_create}")
    private String HTTP_CREATE;
    @Value("${key}")
    private String key;

    @Value("${secret}")
    private String secret;

    //提前多久开启会话
    @Value("${spare_time}")
    private int spare_time;


    /**
     * 在未来的一个时间点创建上课会话
     *
     * @param people   会话人数
     * @param timeLong 会话时长
     * @param start    会话开始时间戳，start为空，立即开始会话
     * @return 返回的json
     */
    @Override
    public String createMeetingOn(Integer people, Integer timeLong, Integer start) {
        if (timeLong <= 10) return "上课时间太短，请核实";
        String json = createMeeting(people, timeLong, start);
        return json;
    }

    /**
     * 创建上课会话
     *
     * @param people   会话人数
     * @param timeLong 会话时长
     * @param start    会议开始时间，即教师与学生约定时间存入数据库的int值，若立即开始，传入 null
     * @return 返回的json
     * @throws UnsupportedEncodingException
     */
    public String createMeeting(Integer people, Integer timeLong, Integer start) {
        HashMap<String, String> params = new HashMap<>();
        params.put("key", key);
        params.put("secret", secret);
        params.put("meeting_capacity", String.valueOf(people));
        params.put("minute", String.valueOf(timeLong + 10));
        if (start == null)
            params.put("start_time", String.valueOf((start - spare_time * 60) * 1000));//比预定时间提前spare_time开启
        String param = null;
        try {
            param = UrlConnectedUtils.createLinkStringByGet(params);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(param);
        String json = UrlConnectedUtils.SendGET(HTTP_CREATE, param);
        System.out.println(json);
        return json;
    }


}
//http://timer.91veo.com/v1/meeting/create?key=xxx&secret=xxx&meeting_capacity=5&minute=90