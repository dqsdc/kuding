package com.qilinxx.kuding.domain.mapper;


import com.qilinxx.kuding.domain.model.Grant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface GrantMapper extends Mapper<Grant> {
    Integer isExist(@Param("sid") String sid,  @Param("did") String did);
}