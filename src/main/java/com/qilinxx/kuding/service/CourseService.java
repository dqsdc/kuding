package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAll();//获取所有课程

    String  insert(Course course);//保存

    String  update(Course course);//更新课程

    String delete(String id);//根据id删除科目

    Course selecteById(String cId);//根据id查找科目

    String  stopCourse(String cId);//根据cId禁用课程

    String  startCourse(String cId);//根据cId启用课程
}
