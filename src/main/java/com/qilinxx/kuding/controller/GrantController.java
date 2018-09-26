package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.domain.model.vo.GrantVo;
import com.qilinxx.kuding.service.GrantService;
import com.qilinxx.kuding.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    //显示购买课程页面
    @RequestMapping("grant.html")
    public String showGrant(HttpServletRequest request) {
        List<Course> courses = grantService.getCourseList();
        request.setAttribute("courses", courses);
        return "grant";
    }

    //显示购买课程页面
    @RequestMapping("member-show.html")
    public String showMember(HttpServletRequest request, String tid) {
        System.out.println(tid);
        Teacher teacher = grantService.selectShowTeacher(tid);
        request.setAttribute("teacher", teacher);
        request.setAttribute("commons", new Commons());
        return "member-show";
    }

    //显示更改时间页面，并将对应的gid传入
    @RequestMapping("grant-edit.html")
    public String showGrantEdit(HttpSession session, String gid) {
        session.setAttribute("gid", gid);
        return "grant-edit";
    }

    //显示授课列表
    @RequestMapping("grant-list.html")
    public String showGrantList(HttpServletRequest request) {
        List<GrantVo> grants = grantService.selectAllGrant();
        System.out.println(grants.size());
        System.out.println(grants.get(0).toString());
        request.setAttribute("grants", grants);
        request.setAttribute("size", grants.size());
        request.setAttribute("commons", new Commons());
        return "grant-list";
    }

    //ajax请求更新时间
    @RequestMapping("/editTime")
    @ResponseBody
    public String editGrantTime(HttpSession session, String time) {
        String gid = (String) session.getAttribute("gid");
        return grantService.updateGrantTimeById(gid, time);
    }

    //取消课程，将授课状态gRecord改为 已取消，并且删除 会议间
    @RequestMapping("/grant-cancel")
    @ResponseBody
    public String cancel(String gid) {
        return grantService.updateStatusById(gid);
    }

    /**
     * 添加授课记录
     * @param sName   学生姓名
     * @param sPhone  学生手机号
     * @param tName   老师姓名
     * @param cName   课程名
     */
    @RequestMapping("/addGrant")
    @ResponseBody
    public String addGrant(String sName, String sPhone, String tName, String cName) {
        return grantService.addGrant(sName, sPhone, tName, cName);
    }
}
