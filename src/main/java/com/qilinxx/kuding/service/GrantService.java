package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.domain.model.vo.GrantVo;

import java.util.List;

public interface GrantService {

    //查找对应授课老师个人信息
    Teacher selectShowTeacher(String id);

    //获得所有的授权记录，包装成增强型 GrantVo
    List<GrantVo> selectAllGrant();

    //得到课程总览表所有信息
    List<Course> getCourseList();

    //根据授课记录的uuid更新时间
    String updateGrantTimeById(String gid, String time);

    //根据授课记录的uuid更新时间
    String updateStatusById(String gid);

    /**
     * 添加一条授课记录
     * @param sName 学生姓名
     * @param sPhone 学生电话
     * @param tName 教师姓名
     * @param cName 课程名称
     * @return 操作记录 msg
     */
    String addGrant(String sName, String sPhone, String tName, String cName);
}
