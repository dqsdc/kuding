package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.domain.model.Detail;
import com.qilinxx.kuding.service.CourseService;
import com.qilinxx.kuding.service.DetailService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lzc
 * 课程管理控制层
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private DetailService detailService;
    /**
     *
     * @return 跳转到course页面
     */
    @RequestMapping("article-list.html")
    public String courseList(Model model){
        List<Course> courseList = courseService.getAll();
        System.out.println(courseList.size());
        model.addAttribute("courseList",courseList);
        return "article-list";
    }

    /**
     *
     * @return 跳转到添加页面
     */
    @RequestMapping("article-add.html")
    public String courseInsertUI(){

        return "article-add";
    }

    /**
     * 保存课程
     * @param cName 课名
     * @param cCreateTime 创建时间
     * @param cDetail  课简
     * @param cCount   总课数
     * @return 返回到course界面
     */
    @RequestMapping("courseAdd")
    public String courseInsert(String cName, String cCreateTime, String cDetail, String cCount){
        String uu32 = UUID.UU32();//生成uuid
        System.out.println("课名："+cName+"创建时间:"+cCreateTime+"课简:"+cDetail+"课成数量:"+cCount);
        Course course = new Course();
        Date date = DateKit.dateFormat(cCreateTime, "yyyy-MM-dd");//生成这一类型的date
        System.out.println(date);
        long timeLong = DateKit.getUnixTimeLong(date);//转化为long类型的时间
        System.out.println(timeLong);
        course.setcName(cName);
        course.setcCreateTime(timeLong);
        course.setcDetail(cDetail);
        course.setcCount(Integer.parseInt(cCount));
        course.setcId(uu32);
        courseService.insert(course);
        return "redirect:article-list.html";
    }
    /**
     *前台传一个课程id进来，查找对象传过去
     * @return 跳转到修改页面
     */
    @RequestMapping("article-edit.html")
    public String courseUpdateUI(Model model, String cId){
        System.out.println("ggod"+cId);
        Course course = courseService.selecteById(cId);
        System.out.println(course);
        model.addAttribute("course",course);
        return "article-edit";
    }
    /**
     * 跟新课程
     * @param cName 课名
     * @param cCreateTime 创建时间
     * @param cDetail  课简
     * @param cCount   总课数
     * @return 返回到course界面
     */
    @RequestMapping("courseUpdate")
    public String courseUpdate(String cName, String cCreateTime, String cDetail, String cCount,String cId){

        System.out.println("课名："+cName+"修改时间:"+cCreateTime+"课简:"+cDetail+"课成数量:"+cCount+"id:"+cId);
        Course course = new Course();
        //Date date = DateKit.dateFormat(cCreateTime, "yyyy-MM-dd");//生成这一类型的date
        //System.out.println(date);
        //long timeLong = DateKit.getUnixTimeLong(date);//转化为long类型的时间
        //System.out.println(timeLong);
        course.setcName(cName);
        course.setcCreateTime(Long.parseLong(cCreateTime));
        course.setcDetail(cDetail);
        course.setcCount(Integer.parseInt(cCount));
        course.setcId(cId);
        courseService.update(course);
        return "redirect:article-list.html";
    }
    /**
     * 删除课程
     */
    @RequestMapping("deleteCourse")
    @ResponseBody
    public String  deleteCourse( String cId){
        System.out.println(cId);
        //得到隐藏域id，根据id删除对象
       // courseService.delete(cId);
        //重新返回到刚才的界面，并且课程已减少
        return "sucess";
    }
    /**
     * 课程详细
     * 根据隐藏域id，取课程详细表中数据，返回listDetail
     * @return 返回到detail界面
     */
    @RequestMapping("/detail")
    public String listDetail(String cId, Model model){
        List<Detail> detailListe = new ArrayList<>();
        detailListe=detailService.getAllbycid(cId);
        model.addAttribute("detailListe",detailListe);
        return "detail";
    }
    /**
     *
     * @return 跳转到添加详课页面
     * @param cId 课程cid
     */
    @RequestMapping("/detail/insertUI")
    public String detailInsertUI(String cId, Model model){

        return "detailInsert";
    }

    /**
     * 保存课程
     * @param dName 课名
     * @param dCreateTime 创建时间
     * @param dDetail  课简
     * @param dNumber   第几章
     * @param  dTimeLength   课时长
     * @return 返回到detail界面
     */
    @RequestMapping("/detail/insert")
    public String detailInsert(String dName, String dCreateTime, String dDetail, String dNumber, String dTimeLength, String cId){
        String uu32 = UUID.UU32();//生成uuid
        System.out.println("课名："+dName+"创建时间:"+dCreateTime+"课简:"+dDetail+"课第几章:"+dNumber+"课时长："+dTimeLength);
        Detail detail = new Detail();
        Date date = DateKit.dateFormat(dCreateTime, "yyyy-MM-dd");//生成这一类型的date
        System.out.println(date);
        long timeLong = DateKit.getUnixTimeLong(date);//转化为long类型的时间
        System.out.println(timeLong);
        detail.setdId(dName);
        detail.setdCidId(cId);
        detail.setdCreateTime(timeLong);
        detail.setdDetail(dDetail);
        detail.setdNumber(Integer.parseInt(dNumber));
        detail.setdTimeLength(Integer.parseInt(dTimeLength));
        detailService.insert(detail);
        return "";//返回详课页面
    }
    /**
     *前台传一个课祥id进来，查找对象传过去
     * @return 跳转到修改页面
     */
    @RequestMapping("/detail/updateUI")
    public String detailUpdateUI(Model model, String dId){
        Detail detail = detailService.selectById(dId);
        model.addAttribute("detail",detail);
        return "detailUpdate";
    }
    /**
     * 跟新详课程
     * @param dName 课名
     * @param dCreateTime 创建时间
     * @param dDetail  课简
     * @param dNumber   第几章
     * @param  dTimeLength   课时长
     * @return 返回到course界面
     */
    @RequestMapping("/detail/update")
    public String detailUpdate(String dName, String dCreateTime, String dDetail, String dNumber, String dTimeLength, String dId){
        System.out.println("课名："+dName+"创建时间:"+dCreateTime+"课简:"+dDetail+"课第几章:"+dNumber+"课时长："+dTimeLength);
        Detail detail = new Detail();
        Date date = DateKit.dateFormat(dCreateTime, "yyyy-MM-dd");//生成这一类型的date
        System.out.println(date);
        long timeLong = DateKit.getUnixTimeLong(date);//转化为long类型的时间
        System.out.println(timeLong);
        detail.setdId(dName);
        detail.setdCreateTime(timeLong);
        detail.setdDetail(dDetail);
        detail.setdNumber(Integer.parseInt(dNumber));
        detail.setdTimeLength(Integer.parseInt(dTimeLength));
        detail.setdId(dId);
        detailService.update(detail);
        return "";//返回界面
    }
    /**
     * 删除课程
     */
    @RequestMapping("/detail/delete")
    public void deleteDetail(String did){
        //得到隐藏域id，根据id删除对象
        courseService.delete(did);
        //重新返回到刚才的界面，并且课程已减少
    }
    @RequestMapping("/index2")
    public String index2(){
        return "index2";
    }
}
