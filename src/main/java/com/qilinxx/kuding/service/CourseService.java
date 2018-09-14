package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAll();//获取所有课程

    void insert(Course course);//保存

    void update(Course course);//更新课程

    void delete(String id);//根据id删除科目

    Course selecteById(String cId);//根据id查找科目
}
