package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.CourseMapper;
import com.qilinxx.kuding.domain.model.Course;
import com.qilinxx.kuding.service.CourseService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        String uu32 = UUID.UU32();
        course.setcId(uu32);
        Date now = DateKit.getNow();
        long timeLong = DateKit.getUnixTimeLong(now);
        course.setcCreateTime(timeLong);
        course.setcRemark("0");//设置状态为未发布
        courseMapper.insert(course);
    }
//更新课程

    public void update(Course course) {
        course.setcRemark("0");
        courseMapper.updateByPrimaryKeySelective(course);
    }

    /**
     * 删除课程
     */


    public void delete(String id) {

        courseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据cid查询科目
     *
     * @param cId
     * @return
     */
    @Override
    public Course selecteById(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        return course;
    }

    /**
     * 根据cId停用课程
     *
     * @param cId
     * @return
     */
    @Override
    public Integer stopCourse(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        course.setcRemark("0");
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    /**
     * 根据cId开启课程
     *
     * @param cId
     * @return
     */
    @Override
    public Integer startCourse(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        course.setcRemark("1");
        return courseMapper.updateByPrimaryKeySelective(course);
    }
}
