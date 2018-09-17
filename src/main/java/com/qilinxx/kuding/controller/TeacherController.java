package com.qilinxx.kuding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 余小北
 * @Date: 2018/9/14 14:46
 * @Description:
 */
@Controller
public class TeacherController {

    @RequestMapping("teacher-list.html")
    public String teacher_list(){

        return "teacher-list";
    }
}
