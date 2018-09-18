package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Detail;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DetailMapper extends Mapper<Detail>{

    List<Detail> selectAllByCid(String id);//根据cid进行查询所有章节课
}