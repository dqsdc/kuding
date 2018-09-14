package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.CourseMapper;
import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

//查询所有课程

    public List<Course> getAll() {
        return courseMapper.selectAll();
    }
//保存课程

    public void insert(Course course) {
        courseMapper.insert(course);
    }
//更新课程

    public void update(Course course) {
        courseMapper.updateByPrimaryKeySelective(course);
    }
//删除课程

    public void delete(String id) {
        courseMapper.deleteByPrimaryKey(id);
    }

    //根据cid查询科目
    @Override
    public Course selecteById(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        return course;
    }
}
