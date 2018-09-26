package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.DetailMapper;
import com.qilinxx.kuding.domain.model.Detail;
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
     *
     * @param id 课程id
     * @return 符合课程id的详细课程list
     */

    public List<Detail> getAllByCid(String id) {
        return detailMapper.selectAllByCid(id);

    }

    /**
     * 添加章节
     *
     * @param detail 添加对象
     */

    public void insert(Detail detail) {
        String uu32 = UUID.UU32();//生成uuid
        detail.setdId(uu32);
        Date now = DateKit.getNow();
        long timeLong = DateKit.getUnixTimeLong(now);
        detail.setdCreateTime(timeLong);
        detail.setdRemark("0");
        detailMapper.insertSelective(detail);
    }

    /**
     * 根据id查找
     *
     * @param dId 详细课程id
     * @return 更新后结果
     */
    @Override
    public Detail selectById(String dId) {
        return detailMapper.selectByPrimaryKey(dId);
    }

    /**
     * 更新详课
     *
     * @param detail 更新对象
     */
    @Override
    public void update(Detail detail) {
        detail.setdRemark("0");
        detailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 根据id删除章节
     *
     * @param did 详细课程id
     */
    @Override
    public void deleteById(String did) {
        detailMapper.deleteByPrimaryKey(did);
    }

    /**
     * 停用详细课程
     *
     * @param dId 详细课程id
     * @return 更新后返回
     */
    @Override
    public Integer stopDetail(String dId) {
        Detail detail = detailMapper.selectByPrimaryKey(dId);
        detail.setdRemark("0");
        return detailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 启用详细课程
     *
     * @param dId 详细课程id
     * @return 更新后返回
     */
    @Override
    public Integer startDetail(String dId) {
        Detail detail = detailMapper.selectByPrimaryKey(dId);
        detail.setdRemark("1");
        return detailMapper.updateByPrimaryKeySelective(detail);
    }

    /**
     * 根据状态查询
     *
     * @param s 状态
     * @return 返回符合改状态的detailList
     */
    @Override
    public List<Detail> selectAllByRemark(String s) {
        List<Detail> detailList = detailMapper.selectAllByRemark(s);
        return detailList;
    }
}
