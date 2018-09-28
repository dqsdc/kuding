package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.service.LogService;
import com.qilinxx.kuding.service.TeacherService;
import com.qilinxx.kuding.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 余小北
 * @Date: 2018/9/14 14:46
 * @Description:
 */
@Controller
public class TeacherController extends BaseController {
    @Autowired
    private LogService logService;

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
        public String tChange_password(String uid, Model model){
            Teacher teacher = teacherService.selectTeacherById(uid);
            model.addAttribute("teacher",teacher);
            return "teacher-change-password";
        }
        @ResponseBody
        @RequestMapping("/tchangePassword")
        public String tChangePassword(String sId,String newPassword,HttpServletRequest request){
        int i=teacherService.changePasswordByTId(sId,newPassword);
        logService.insertLog("修改老师密码成功"+sId,userId(request), request.getRemoteAddr());


            return   "修改成功";
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
            model.addAttribute("commons",new Commons());
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
        public String teacher_show(String uid,Model model){
            System.out.println(uid);
            Teacher teacher= teacherService.selectTeacherById(uid);
            System.out.println(teacher);
            model.addAttribute("teacher",teacher);
            model.addAttribute("commons",new Commons());
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
        public String addTeacher(MultipartFile file, HttpServletRequest request,Teacher teacher){

           try {
               Integer i=teacherService.addTeacher(file,request,teacher);
           }catch (Exception e){
               logService.insertLog("添加老师失败"+teacher.gettName(),userId(request), request.getRemoteAddr());

               return "添加失败";

           }
            logService.insertLog("成功添加老师"+teacher.gettName(),userId(request), request.getRemoteAddr());

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
        @RequestMapping("/deleteTeacher")
        public String deleteTeacher( String uid,HttpServletRequest request){
            System.out.println(uid);
            Integer i=teacherService.deleteTeacherById(uid);
            if(i>0){
                logService.insertLog("成功删除老师"+uid,userId(request), request.getRemoteAddr());
                return "删除成功";
            }else {
                logService.insertLog("删除老师"+uid+"失败",userId(request), request.getRemoteAddr());
                return "删除失败";
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
        public String stopTeacher(String uid,HttpServletRequest request){

            Integer i=teacherService.stopTeacher(uid);
            logService.insertLog("成功停用老师"+uid,userId(request), request.getRemoteAddr());

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
        public String startTeacher(String uid,HttpServletRequest request){
            Integer i=teacherService.startTeacher(uid);
            logService.insertLog("成功启用老师"+uid,userId(request), request.getRemoteAddr());
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
        public String editTeacher(MultipartFile file, javax.servlet.http.HttpServletRequest request, Model model,Teacher teacher) {
            if(file==null){
                teacherService.editTeacher(teacher);
                model.addAttribute("Success","修改成功");
                logService.insertLog("成功修改老师"+teacher.gettName()+"的信息",userId(request), request.getRemoteAddr());

                return "修改成功";
            }else {
                Integer i=teacherService.editTeacherAndFile(file,request,teacher);
                if (i>0){
                    logService.insertLog("成功修改老师"+teacher.gettName()+"的信息",userId(request), request.getRemoteAddr());

                    model.addAttribute("isSuccess",i);
                    return "修改成功";
                }else {
                    model.addAttribute("isSuccess",i);
                    logService.insertLog("修改老师"+teacher.gettName()+"的信息失败",userId(request), request.getRemoteAddr());

                    return "修改失败";
                }

            }
        }


 }


