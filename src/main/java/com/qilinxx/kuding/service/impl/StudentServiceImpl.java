package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.StudentMapper;
import com.qilinxx.kuding.domain.model.Student;
import com.qilinxx.kuding.service.StudentService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.Md5Utils;
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
        return studentList;
    }


    //修改学生信息
    @Override
    public Integer editStudent(Student student) {

        return  studentMapper.updateByPrimaryKeySelective(student);
    }

    //根据ID查询学生信息
    @Override
    public Student selectStudentById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addStudent(Student student) {
        //Md5加盐加密
        //String password=student.getsPassword();
        //String newPassword= Md5Utils.encryptPassword(password,UUID.UU32());
        //student.setsPassword(newPassword);
        student.setsId(UUID.UU32());

        student.setsCreateTime(new Date().getTime());
        return studentMapper.insert(student);
    }

    @Override
    public Integer deleteStudentById(String uid) {
        return studentMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public Integer stopStudent(String uid) {
        Student student=studentMapper.selectByPrimaryKey(uid);

        student.setsState(false);
        System.out.println(student);
        return  studentMapper.updateByPrimaryKeySelective(student);

    }

    @Override
    public Integer startStudent(String uid) {
        Student student=studentMapper.selectByPrimaryKey(uid);

        student.setsState(true);
        //System.out.println(student);
        return  studentMapper.updateByPrimaryKeySelective(student);

    }

    @Override
    public Integer changePasswordBySId(String sId, String newpassword) {
        Student student=studentMapper.selectByPrimaryKey(sId);
        student.setsPassword(newpassword);

        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
