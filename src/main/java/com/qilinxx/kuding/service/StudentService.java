package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAllStudent();

    void editStudent(Student student);

    Student selectStudentById(String id);

    Integer addStudent(Student student);

    Integer deletStudentById(String uid);
}
