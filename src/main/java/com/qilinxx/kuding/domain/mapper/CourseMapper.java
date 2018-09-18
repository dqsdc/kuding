package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CourseMapper extends Mapper<Course>{
    String selectIdByName(@Param("name")String name);
}