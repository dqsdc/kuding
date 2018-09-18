package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.TeacherMapper;
import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.domain.model.TeacherExample;
import com.qilinxx.kuding.service.TeacherService;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectTeacherById(String uid) {


        return teacherMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int changePasswordByTId(String sId, String newpassword) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(sId);
        teacher.settPassword(newpassword);
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        return teacherMapper.selectAll();
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        teacher.settId(UUID.UU32());

        teacher.settCreateTime(new Date().getTime());

        return   teacherMapper.insert(teacher);
    }

    @Override
    public Integer deleteTeacherById(String uid) {
        return teacherMapper.delete(teacherMapper.selectByPrimaryKey(uid));
    }

    @Override
    public Integer stopTeacher(String uid) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(uid);
        teacher.settState(false);
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    @Override
    public Integer startTeacher(String uid) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(uid);
        teacher.settState(true);
        return teacherMapper.updateByPrimaryKey(teacher);

    }

    @Override
    public void editTeacher(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }
}
