package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Student;
import com.qilinxx.kuding.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/9/14 11:13
 * @Description:
 */
@Controller
public class StudentController {

   
    @Autowired
    private StudentService studentService;
    
    /** 
    *@Author: pengxiaoyu 
    * @Description: 查询所有学生信息发送到学生列表页面 
    * @Param: [model] 
    * @return: java.lang.String 
    * @Date: 2018/9/17 
    */ 
    @RequestMapping("/student-list.html")
    public String showMemberList(Model model) {
//        System.out.println("student-list.html");
//
        List<Student> studentList=studentService.selectAllStudent();

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
    @RequestMapping("/member-show.html")
    public String member_show(String id,Model model){

       Student student= studentService.selectStudentById(id);
       model.addAttribute("student",student);

        return "member-show";
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
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        Integer i=studentService.addStudent(student);

        System.out.println(student);
        return "redirect:/student-list.html";
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 删除一个用户  真的删除
    * @Param:
    * @return:
    * @Date: 2018/9/17
    */

    @ResponseBody
    @RequestMapping("/deleteStudent")
    public String deleteStudent( String uid){
        System.out.println(uid);
        Integer i=studentService.deletStudentById(uid);
        if(i>0){
            System.out.println(i);
            return "success";
        }else {
            System.out.println(i);
            return "fail";
        }


    }
}
