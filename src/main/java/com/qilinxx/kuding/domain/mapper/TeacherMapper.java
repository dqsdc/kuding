package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface TeacherMapper extends Mapper<Teacher>{
    Teacher selectByName(@Param("name")String name);

    List<String> selectAllNumber();
    @Select(" SELECT t_name from web_teacher where t_id=#{tId}")
    String selectNameById(@Param("tId") String tId);
}