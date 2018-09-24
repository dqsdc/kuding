package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface StudentMapper extends Mapper<Student>{

    Student selectByPhone(@Param("phone")String phone);

    List<String> selectAllNumber();
}