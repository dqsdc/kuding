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

    public String  insert(Course course) {
        String uu32 = UUID.UU32();
        course.setcId(uu32);
        Date now = DateKit.getNow();
        long timeLong = DateKit.getUnixTimeLong(now);
        course.setcCreateTime(timeLong);
        course.setcRemark("0");//设置状态为未发布
        courseMapper.insert(course);
        return "增加了:"+course.getcName()+"这门课，"+"总共有:"+course.getcCount()+"节课";
    }
//更新课程

    public String  update(Course course) {
        course.setcRemark("0");
        courseMapper.updateByPrimaryKeySelective(course);
        return "更新了这门:"+course.getcName()+",并且还在验证通过中。。";
    }

    /**
     * 删除课程
     */


    public String  delete(String id) {
        Course course = courseMapper.selectByPrimaryKey(id);
        courseMapper.deleteByPrimaryKey(id);
        return "删除了这门:"+course.getcName()+"课程";
    }

    /**
     * 根据cid查询科目
     * @param cId 课程id
     * @return 返回课程对象
     */
    @Override
    public Course selecteById(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        return course;
    }

    /**
     * 根据cId停用课程
     * @param cId  课程id
     * @return  mapper返回Integer
     */
    @Override
    public String  stopCourse(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        course.setcRemark("0");
        courseMapper.updateByPrimaryKeySelective(course);
        return "停止开设:"+course.getcName();
    }

    /**
     * 根据cId开启课程
     * @param cId  课程id
     * @return mapper返回Integer
     */
    @Override
    public String  startCourse(String cId) {
        Course course = courseMapper.selectByPrimaryKey(cId);
        course.setcRemark("1");
        courseMapper.updateByPrimaryKeySelective(course);
        return "开设了:"+course.getcName();
    }
}
