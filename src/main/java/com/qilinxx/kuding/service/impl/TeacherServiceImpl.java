package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.TeacherMapper;
import com.qilinxx.kuding.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
}
