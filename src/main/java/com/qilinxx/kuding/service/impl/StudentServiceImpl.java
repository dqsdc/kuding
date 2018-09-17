package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.StudentMapper;
import com.qilinxx.kuding.domain.model.Student;
import com.qilinxx.kuding.service.StudentService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    //查询所有的学生列表
    @Override
    public List<Student> selectAllStudent() {
        List<Student> studentList=studentMapper.selectAll();
//        for(Student s:studentList){
//            s.
//        }
        return studentList;
    }


    //修改学生信息
    @Override
    public void editStudent(Student student) {

    }

    //根据ID查询学生信息
    @Override
    public Student selectStudentById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addStudent(Student student) {
        student.setsId(UUID.UU32());
//        student.setsCreateTime(DateKit.getTodayTime());
        student.setsCreateTime(DateKit.getUnixTimeLong());
        return studentMapper.insert(student);
    }

    @Override
    public Integer deletStudentById(String uid) {
        return studentMapper.deleteByPrimaryKey(uid);
    }
}
