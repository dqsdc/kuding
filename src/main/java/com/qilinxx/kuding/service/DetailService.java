package com.qilinxx.kuding.service;

import com.qilinxx.kuding.domain.model.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> getAllByCid(String id);//查询所有外键字段为id的数据

    void insert(Detail detail);//添加章节课程

    Detail selectById(String dId);//根据id查找详课

    void update(Detail detail);//更新详课信息

    void deleteById(String did);//通过id删除章节课程

    Integer stopDetail(String dId);//通过id停用课程

    Integer startDetail(String dId);//通过id开启课程

    List<Detail> selectAllByRemark(String s);//根据状态查询详细课程
}
