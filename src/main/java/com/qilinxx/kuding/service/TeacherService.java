package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher selectTeacherById(String uid);

    int changePasswordByTId(String sId, String newpassword);

    List<Teacher> selectAllTeacher();

    Integer addTeacher(Teacher teacher);

    Integer deleteTeacherById(String uid);

    Integer stopTeacher(String uid);

    Integer startTeacher(String uid);

    void editTeacher(Teacher teacher);

    Integer changePasswordBySId(String sId, String newpassword);
}
