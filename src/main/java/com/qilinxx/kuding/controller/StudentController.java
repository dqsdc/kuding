package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Student;
import com.qilinxx.kuding.service.LogService;
import com.qilinxx.kuding.service.StudentService;
import com.qilinxx.kuding.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/9/14 11:13
 * @Description:
 */
@Controller
public class StudentController extends BaseController  {

    @Autowired
    LogService logService;
    @Autowired
    private StudentService studentService;

    /**
    *@Author: pengxiaoyu
    * @Description:跳转到修改密码的页面
    * @Param: []
    * @return: java.lang.String
    * @Date: 2018/9/17
    */
    @RequestMapping("student-change-password.html")
    public String change_password(String uid,Model model){
        Student student = studentService.selectStudentById(uid);
        model.addAttribute("student",student);
        return "student-change-password";
    }
    @ResponseBody
    @RequestMapping("/changePassword")
    public String changePassword(String sId,String newpassword,HttpServletRequest request){
        int i=studentService.changePasswordBySId(sId,newpassword);
        logService.insertLog("成功修改学生ID为"+sId+"的密码",userId(request), request.getRemoteAddr());

        return   "success";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 查询所有学生信息发送到学生列表页面 
    * @Param: [model] 
    * @return: java.lang.String 
    * @Date: 2018/9/17 
    */ 
    @RequestMapping("student-list.html")
    public String showMemberList(Model model) {
        List<Student> studentList=studentService.selectAllStudent();
        model.addAttribute("commons",new Commons());
        model.addAttribute("studentList",studentList);
        return "student-list";
    }
    /** 
    *@Author: pengxiaoyu 
    * @Description: 根据学生ID查询个人信息 
    * @Param: [id, model] 
    * @return: java.lang.String 
    * @Date: 2018/9/17 
    */ 
    @RequestMapping("student-show.html")
    public String member_show(String uid,Model model){
        System.out.println(uid);
       Student student= studentService.selectStudentById(uid);
       model.addAttribute("student",student);
        model.addAttribute("commons",new Commons());
        return "student-show";
    }

    /**
    *@Author: pengxiaoyu
    * @Description: 跳转添加学生的页面
    * @Param: []
    * @return: java.lang.String
    * @Date: 2018/9/17
    */
    @RequestMapping("student-add.html")
    public String  Student_add(){

        return "student-add";
    }
    /**
     *@Author: pengxiaoyu
     * @Description: 添加学生用户
     * @Param:
     * @return:
     * @Date: 2018/9/17
     */
    @ResponseBody
    @RequestMapping("/addStudent")
    public String addStudent(Student student, HttpServletRequest request){
        Integer i=studentService.addStudent(student);
        if (i>0) {
            logService.insertLog("成功添加一个学生"+student.getsName(),userId(request), request.getRemoteAddr());
        }else {
            logService.insertLog("添加一个学生"+student.getsName()+"失败",userId(request), request.getRemoteAddr());
        }
        return "添加成功";
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 删除一个用户  从数据库真的删除
    * @Param:
    * @return:
    * @Date: 2018/9/17
    */
    @ResponseBody
    @RequestMapping("/deleteStudent")
    public String deleteStudent( String uid,HttpServletRequest request){
        Integer i=studentService.deleteStudentById(uid);
        if (i>0) {
            logService.insertLog("成功删除一个学生，他的ID为"+uid,userId(request), request.getRemoteAddr());
            return "删除成功";
        }else {
            logService.insertLog("删除一个学生，他的ID为"+uid+"失败",userId(request), request.getRemoteAddr());
            return "删除失败";
        }

    }
    /**
    *@Author: pengxiaoyu
    * @Description: 禁用学生
    * @Param: [uid]
    * @return: java.lang.String
    * @Date: 2018/9/18
    */
    @ResponseBody
    @RequestMapping("/stopStudent")
    public String stopStudent(String uid,HttpServletRequest request){
        Integer i=studentService.stopStudent(uid);

        if (i>0) {
            logService.insertLog("成功停用一个学生，他的ID为"+uid,userId(request), request.getRemoteAddr());
            return  "停用成功";
        }else {
            logService.insertLog("停用一个学生，他的ID为"+uid+"失败",userId(request), request.getRemoteAddr());
            return  "停用失败";
        }



    }
    /**
    *@Author: pengxiaoyu
    * @Description: 启用学生
    * @Param: [uid]
    * @return: java.lang.String
    * @Date: 2018/9/18
    */
    @ResponseBody
    @RequestMapping("/startStudent")
    public String startStudent(String uid,HttpServletRequest request){
        Integer i=studentService.startStudent(uid);
        logService.insertLog("成功启用一个学生，他的ID为"+uid,userId(request), request.getRemoteAddr());
        return "success";
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 跳转到修改学生信息页面
    * @Param:
    * @return:
    * @Date: 2018/9/18
    */
    @RequestMapping("student-edit.html")
    public String student_edit(String uid,Model model){

        Student student = studentService.selectStudentById(uid);
        model.addAttribute("student",student);
        return "student-edit";
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 修改学生信息
    * @Param:
    * @return:
    * @Date: 2018/9/18
    */

    @ResponseBody
    @RequestMapping("/editStudent")
    public String editStudent(Student student,HttpServletRequest request){
        studentService.editStudent(student);
        logService.insertLog("成功修改学生"+student.getsName()+"的信息",userId(request), request.getRemoteAddr());
        return "修改成功";
    }

    @ResponseBody
    @RequestMapping("/checkNumber")
    public String checkNumber(String number){
        return  studentService.checkNumber(number);

    }
}
