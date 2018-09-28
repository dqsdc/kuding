package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAllStudent();

    Integer editStudent(Student student);

    Student selectStudentById(String id);

    Integer addStudent(Student student);

    Integer deleteStudentById(String uid);

    Integer stopStudent(String uid);

    Integer startStudent(String uid);

    Integer changePasswordBySId(String sId, String newpassword);

    String checkNumber(String number);


}
