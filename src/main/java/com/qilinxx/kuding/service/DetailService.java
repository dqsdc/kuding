package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> getAllbycid(String id);//查询所有外键字段为id的数据

    void insert(Detail detail);//添加章节课程

    Detail selectById(String dId);//根据id查找详课

    void update(Detail detail);//更新详课信息
}
