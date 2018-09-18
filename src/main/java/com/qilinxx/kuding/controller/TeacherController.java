package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.service.TeacherService;
import com.qilinxx.kuding.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/9/14 14:46
 * @Description:
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

        /**
         *@Author: pengxiaoyu
         * @Description:跳转到老师修改密码的页面
         * @Param: []
         * @return: java.lang.String
         * @Date: 2018/9/17
         */
        @RequestMapping("teacher-change-password.html")
        public String tchange_password(String uid, Model model){
            Teacher teacher = teacherService.selectTeacherById(uid);
            model.addAttribute("teacher",teacher);
            return "teacher-change-password";
        }
        @ResponseBody
        @RequestMapping("/tchangePassword")
        public String tchangePassword(String sId,String newpassword){
            int i=teacherService.changePasswordByTId(sId,newpassword);
            System.out.println(sId+newpassword);
            return   "redirect:/teacher-list.html";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 查询所有老师信息发送到老师列表页面
         * @Param: [model]
         * @return: java.lang.String
         * @Date: 2018/9/17 
         */
        @RequestMapping("/teacher-list.html")
        public String showMemberList(Model model) {

            List<Teacher> teacherList=teacherService.selectAllTeacher();
            System.out.println(teacherList);
            model.addAttribute("teacherList",teacherList);
            return "teacher-list";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 根据老师ID查询个人信息
         * @Param: [id, model] 
         * @return: java.lang.String
         * @Date: 2018/9/17 
         */
        @RequestMapping("teacher-show.html")
        public String member_show(String uid,Model model){
            System.out.println(uid);
            Teacher teacher= teacherService.selectTeacherById(uid);
            model.addAttribute("teacher",teacher);

            return "teacher-show";
        }

        /**
         *@Author: pengxiaoyu
         * @Description: 跳转添加老师的页面
         * @Param: []
         * @return: java.lang.String
         * @Date: 2018/9/17
         */
        @RequestMapping("teacher-add.html")
        public String  Teacher_add(){

            return "teacher-add";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 添加老师用户
         * @Param:
         * @return:
         * @Date: 2018/9/17
         */
        @ResponseBody
        @RequestMapping("/addTeacher")
        public String addTeacher(Teacher teacher){
            Integer i=teacherService.addTeacher(teacher);
            System.out.println(teacher.gettSex());
            System.out.println(teacher);
            return "redirect:/teacher-list.html";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 删除一个用户  从数据库真的删除
         * @Param:
         * @return:
         * @Date: 2018/9/17
         */
        @ResponseBody
        @RequestMapping("/deleteTeacher")
        public String deleteTeacher( String uid){
            System.out.println(uid);
            Integer i=teacherService.deleteTeacherById(uid);
            if(i>0){
                System.out.println(i);
                return "success";
            }else {
                System.out.println(i);
                return "fail";
            }

        }
        /**
         *@Author: pengxiaoyu
         * @Description: 禁用老师
         * @Param: [uid]
         * @return: java.lang.String
         * @Date: 2018/9/18
         */
        @ResponseBody
        @RequestMapping("/stopTeacher")
        public String stopTeacher(String uid){

            Integer i=teacherService.stopTeacher(uid);

            return "success";

        }
        /**
         *@Author: pengxiaoyu
         * @Description: 启用老师
         * @Param: [uid]
         * @return: java.lang.String
         * @Date: 2018/9/18
         */
        @ResponseBody
        @RequestMapping("/startTeacher")
        public String startTeacher(String uid){
            Integer i=teacherService.startTeacher(uid);
            return "success";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 跳转到修改老师信息页面
         * @Param:
         * @return:
         * @Date: 2018/9/18
         */
        @RequestMapping("teacher-edit.html")
        public String teacher_edit(String uid,Model model){

            Teacher teacher = teacherService.selectTeacherById(uid);
            model.addAttribute("teacher",teacher);
            return "teacher-edit";
        }
        /**
         *@Author: pengxiaoyu
         * @Description: 修改老师信息
         * @Param:
         * @return:
         * @Date: 2018/9/18
         */

        @ResponseBody
        @RequestMapping("/editTeacher")
        public String editTeacher(Teacher teacher){
            System.out.println(teacher);
            teacherService.editTeacher(teacher);
            return "success";
        }
    }


