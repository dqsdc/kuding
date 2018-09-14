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
    private static String HTTP_CREATE;
    @Value("${key}")
    private String key;

    @Value("${secret}")
    private String secret;

    /***
     * 创建会议
     * @param people 会议参与人数（包括主持人）
     * @param time 会议时间
     * @return 返回第三方响应的json数据
     * @throws UnsupportedEncodingException
     */
    @Override
    public String createMeeting(int people, int time) throws UnsupportedEncodingException {
        if (time > 10) {
            System.out.println("create meeting");
            HashMap<String, String> params = new HashMap<>();
            params.put("key", key);
            params.put("secret", secret);
            params.put("meeting_capacity", String.valueOf(people));
            params.put("minute", String.valueOf(time));
            String param = UrlConnectedUtils.createLinkStringByGet(params);
            System.out.println(param);
            String json = UrlConnectedUtils.SendGET(HTTP_CREATE, param);
            System.out.println(json);
            return json;
        }
        return "会议时间不可以少于10";
    }
}
//http://timer.91veo.com/v1/meeting/create?key=xxx&secret=xxx&meeting_capacity=5&minute=90