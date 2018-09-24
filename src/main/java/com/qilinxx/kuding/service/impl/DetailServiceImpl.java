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

    public List<Detail> getAllByCid(String id) {
//        DetailExample example=new DetailExample();
//        DetailExample.Criteria criteria = example.createCriteria();
//        criteria.andDCidIdEqualTo(id);

       return detailMapper.selectAllByCid(id);
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
        long time = now.getTime();
        detail.setdCreateTime(time);
        detail.setdRemark("0");
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

    /**
     * 根据id删除章节
     * @param did
     */
    @Override
    public void deleteById(String did) {
        detailMapper.deleteByPrimaryKey(did);
    }

    /**
     * 停用详细课程
     * @param dId
     * @return
     */
    @Override
    public Integer stopDetail(String dId) {
        Detail detail = detailMapper.selectByPrimaryKey(dId);
        detail.setdRemark("0");
        return detailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 启用详细课程
     * @param dId
     * @return
     */
    @Override
    public Integer startDetail(String dId) {
        Detail detail = detailMapper.selectByPrimaryKey(dId);
        detail.setdRemark("1");
        return detailMapper.updateByPrimaryKeySelective(detail);
    }
}
