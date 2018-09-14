package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Detail;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DetailMapper extends Mapper<Detail>{

    @Select("SELECT * FROM web_detail WHERE d_cid_id = #{id}")
    List<Detail> selectAllbycid(String id);//根据cid进行查询所有章节课
}