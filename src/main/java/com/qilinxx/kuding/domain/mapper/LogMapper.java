package com.qilinxx.kuding.domain.mapper;

import com.qilinxx.kuding.domain.model.Log;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface LogMapper extends Mapper<Log> {
    List<Log> selectAdminLogin();
}