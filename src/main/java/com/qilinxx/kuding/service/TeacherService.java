package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Teacher;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TeacherService {
    Teacher selectTeacherById(String uid);

    Integer changePasswordByTId(String sId, String newpassword);

    List<Teacher> selectAllTeacher();

    Integer addTeacher(MultipartFile file, HttpServletRequest request,Teacher teacher);

    Integer deleteTeacherById(String uid);

    Integer stopTeacher(String uid);

    Integer startTeacher(String uid);

    void editTeacher(Teacher teacher);

    Integer editTeacherAndFile(MultipartFile file, HttpServletRequest request, Teacher teacher);
}
