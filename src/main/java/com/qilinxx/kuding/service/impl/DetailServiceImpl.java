package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.DetailMapper;
import com.qilinxx.kuding.domain.model.Detail;
import com.qilinxx.kuding.domain.model.DetailExample;
import com.qilinxx.kuding.service.DetailService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public List<Detail> getAllbycid(String id) {
//        DetailExample example=new DetailExample();
//        DetailExample.Criteria criteria = example.createCriteria();
//        criteria.andDCidIdEqualTo(id);

       return detailMapper.selectAllbycid(id);
       // return null;
       // return  detailMapper.selectByExample(example);
    }

    /**
     * 添加章节
     * @param detail
     */

    public void insert(Detail detail) {
        String uu32 = UUID.UU32();//生成uuid
        detail.setdId(uu32);
        Date now = DateKit.getNow();
        System.out.println("当前时间："+now);
        long time = now.getTime();
        System.out.println("转换后的："+time);
        detail.setdCreateTime(time);
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
        Date now = DateKit.getNow();
        System.out.println("当前时间："+now);
        long time = now.getTime();
        System.out.println("转换后的："+time);
        detail.setdCreateTime(time);
        detailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 根据id删除章节
     * @param did
     */
    @Override
    public void deleteById(String did) {
        detailMapper.deleteByPrimaryKey(did);
    }
}
