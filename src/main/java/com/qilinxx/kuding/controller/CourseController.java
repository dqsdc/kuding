package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.domain.model.Detail;
import com.qilinxx.kuding.service.CourseService;
import com.qilinxx.kuding.service.DetailService;
import com.qilinxx.kuding.service.LogService;
import com.qilinxx.kuding.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lzc
 * 课程管理控制层
 */
@Controller
public class CourseController extends BaseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private DetailService detailService;
    @Autowired
    private LogService logService;

    /**
     * @return 跳转到course页面
     */
    @RequestMapping("article-list.html")
    public String courseList(Model model) {
        List<Course> courseList = courseService.getAll();
        model.addAttribute("courseList", courseList);
        model.addAttribute("commons",new Commons());
        return "article-list";
    }

    /**
     * @return 跳转到添加页面
     */
    @RequestMapping("article-add.html")
    public String courseInsertUI() {
        return "article-add";
    }

    /**
     * 保存课程
     *
     * @param cName   课名
     * @param cDetail 课简
     * @param cCount  总课数
     * @return 返回到course界面
     */
    @RequestMapping("courseAdd")
    public String courseInsert(String cName, String cDetail, String cCount,HttpServletRequest request) {
        Course course = new Course();
        course.setcName(cName);
        course.setcDetail(cDetail);
        course.setcCount(Integer.parseInt(cCount));
        String str = courseService.insert(course);
        logService.insertLog(str,userId(request),userIp(request));
        return "redirect:article-list.html";
    }

    /**
     * 前台传一个课程id进来，查找对象传过去
     *
     * @return 跳转到修改页面
     */
    @RequestMapping("article-edit.html")
    public String courseUpdateUI(Model model, String cId) {
        Course course = courseService.selecteById(cId);
        model.addAttribute("course", course);
        return "article-edit";
    }

    /**
     * 跟新课程
     *
     * @param cName   课名
     * @param cDetail 课简
     * @param cCount  总课数
     * @return 返回到course界面
     */
    @RequestMapping("courseUpdate")
    @ResponseBody
    public String courseUpdate(String cName, String cDetail, String cCount, String cId,HttpServletRequest request) {
        Course course = courseService.selecteById(cId);
        course.setcName(cName);
        course.setcDetail(cDetail);
        course.setcCount(Integer.parseInt(cCount));
        String str = courseService.update(course);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 删除课程
     */
    @RequestMapping("deleteCourse")
    @ResponseBody
    public String deleteCourse(String cId,HttpServletRequest request) {
        //得到隐藏域id，根据id删除对象
        String str = courseService.delete(cId);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 课程详细
     * 根据隐藏域id，取课程详细表中数据，返回listDetail
     *
     * @return 返回到detail界面
     */
    @RequestMapping("detail-list.html")
    public String listDetail(String cId, Model model) {
            List<Detail> detailList  = detailService.getAllByCid(cId);
            model.addAttribute("detailList", detailList);
            model.addAttribute("cId", cId);
        model.addAttribute("commons",new Commons());
        return "detail-list";
    }

    /**
     * @param cId 课程cid
     * @return 跳转到添加详课页面
     */
    @RequestMapping("detail-add.html")
    public String detailInsertUI(String cId, Model model) {
        model.addAttribute("cId", cId);
        return "detail-add";
    }

    /**
     * 保存课程
     *
     * @param dName       课名
     * @param dDetail     课简
     * @param dNumber     第几章
     * @param dTimeLength 课时长
     * @return 返回到detail界面
     */
    @RequestMapping("detailInsert")
    @ResponseBody
    public String detailInsert(String dName, String dDetail, String dNumber, String dTimeLength, String cId,HttpServletRequest request) {
        Detail detail = new Detail();
        detail.setdName(dName);
        detail.setdDetail(dDetail);
        detail.setdNumber(Integer.parseInt(dNumber));
        detail.setdTimeLength(Integer.parseInt(dTimeLength));
        detail.setdCidId(cId);
        String str = detailService.insert(detail);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 前台传一个课祥id进来，查找对象传过去
     *
     * @return 跳转到修改页面
     */
    @RequestMapping("detail-edit.html")
    public String detailUpdateUI(Model model, String dId) {
        Detail detail = detailService.selectById(dId);
        model.addAttribute("detail", detail);
        return "detail-edit";
    }

    /**
     * 跟新详课程
     *
     * @param dName       课名
     * @param dDetail     课简
     * @param dNumber     第几章
     * @param dTimeLength 课时长
     * @return 返回到course界面
     */
    @RequestMapping("detailUpdate")
    public String detailUpdate(String dName, String dDetail, String dNumber, String dTimeLength, String dId, String dCidId, HttpServletRequest request) {
        Detail detail = detailService.selectById(dId);
        detail.setdName(dName);
        detail.setdDetail(dDetail);
        detail.setdNumber(Integer.parseInt(dNumber));
        detail.setdTimeLength(Integer.parseInt(dTimeLength));
        String str = detailService.update(detail);
        logService.insertLog(str,userId(request),userIp(request));
        return "redirect:detail-list.html";//返回界面
    }

    /**
     * 删除课程
     */
    @RequestMapping("deleteDetail")
    @ResponseBody
    public String deleteDetail(String dId,HttpServletRequest request) {
        //得到隐藏域id，根据id删除对象
        String str = detailService.deleteById(dId);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 禁用课程
     * @param cId 课程id
     * @return 成功
     */
    @RequestMapping("stopCourse")
    @ResponseBody
    public String stopCourse(String cId,HttpServletRequest request) {
        String str = courseService.stopCourse(cId);
        System.out.println("禁用信息："+str);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 开启课程
     *
     * @param cId  课程id
     * @return 成功
     */
    @RequestMapping("startCourse")
    @ResponseBody
    public String startCourse(String cId, HttpServletRequest request) {
        String str = courseService.startCourse(cId);
        System.out.println(userId(request));
        System.out.println("传过来的语句："+str);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 禁用详细课程
     *
     * @param dId  详细课程id
     * @return 成功
     */
    @RequestMapping("stopDetail")
    @ResponseBody
    public String stopDetail(String dId,HttpServletRequest request) {
        String str = detailService.stopDetail(dId);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

    /**
     * 开启课程
     * @param dId 详细课程id
     * @return 成功
     */
    @RequestMapping("startDetail")
    @ResponseBody
    public String startDetail(String dId,HttpServletRequest request) {
        String str = detailService.startDetail(dId);
        logService.insertLog(str,userId(request),userIp(request));
        return "success";
    }

}
