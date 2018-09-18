package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.DetailMapper;
import com.qilinxx.kuding.domain.model.Detail;
import com.qilinxx.kuding.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailMapper detailMapper;


    /**
     * 根据cid查询所有章节课
     * @param id  课程id
     * @return
     */

    public List<Detail> getAllByCid(String id) {
        return detailMapper.selectAllByCid(id);
       // return null;
    }

    /**
     * 添加章节
     * @param detail
     */

    public void insert(Detail detail) {
        detailMapper.insertSelective(detail);
    }

    /**
     * 根据id查找
     * @param dId
     * @return
     */
    @Override
    public Detail selectById(String dId) {
        return detailMapper.selectByPrimaryKey(dId);
    }

    /**
     * 更新详课
     * @param detail
     */
    @Override
    public void update(Detail detail) {
        detailMapper.updateByPrimaryKeySelective(detail);
    }
}
