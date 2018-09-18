package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.vo.GrantVo;
import com.qilinxx.kuding.service.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: ljm
 * @Date: 2018-09-17 16:26
 * @Description: 安排课程
 */
@Controller
public class GrantController {

    @Autowired
    GrantService grantService;

    @RequestMapping("grant.html")
    public String showGrant() {
        return "grant";
    }

    @RequestMapping("grant-list.html")
    public String showGrantList(HttpServletRequest request) {
        List<GrantVo> grants = grantService.selectAllGrant();
        System.out.println(grants.size());
        System.out.println(grants.get(0).toString());
        request.setAttribute("grants", grants);
        return "grant-list";
    }

    /**
     * 添加授课记录
     *
     * @param request 返回操作信息
     * @param sName  学生姓名
     * @param sPhone 学生手机号
     * @param tName 老师姓名
     * @param cName 课程名
     * @return
     */
    @RequestMapping("/addGrant")
    public String addGrant(HttpServletRequest request, String sName, String sPhone, String tName, String cName) {
        String msg = grantService.addGrant(sName, sPhone, tName, cName);
        System.out.println(msg);
        if (msg.equals("成功添加"))
            return "grant-list";
        else {
            request.setAttribute("msg", msg + ",请重新输入");
            return "grant";
        }
    }


}
