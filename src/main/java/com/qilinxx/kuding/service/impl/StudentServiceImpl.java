package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.StudentMapper;
import com.qilinxx.kuding.domain.model.Student;
import com.qilinxx.kuding.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAll();
    }

    @Override
    public void editStudent(Student student) {

    }
}
